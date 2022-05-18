/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import java.io.IOException;
import java.util.ArrayList;

public class Pegawai extends Akun implements UserC {
    private ArrayList<DataKucing> dataKucing;
    private String telp0;

    // Constructor
    public Pegawai(String username, String password, String nama, String jenisKelamin, String alamat, String telp0) {
        super(username, password, nama, jenisKelamin, alamat);
        this.telp0 = telp0;
        dataKucing = new ArrayList<>();
    }

    public String getTelp0() {
        return telp0;
    }

    public void setTelp0(String telp0) {
        this.telp0 = telp0;
    }

    @Override
    public void profile() {
        System.out.println("\n    ==========================================");
        System.out.println("                   P R O F I L                ");
        System.out.println("    ==========================================");
        System.out.println("    Nama          : " + this.nama);
        System.out.println("    Jenis Kelamin : " + this.jenisKelamin);
        System.out.println("    Alamat        : " + this.alamat);
        System.out.println("    Telepon       : " + this.telp0);
        System.out.println("    ==========================================");
    }

    @Override
    public void bookingPenitipan() {
        try {
            DataKucing.displayKelas();
            System.out.print("\n    Masukan Kode Booking   : ");
            String kodeBooking = input.readLine();
            for (DataKucing k : DataKucing.getDataKucing()) {
                if (k.getKodeBooking0().equals(kodeBooking)) {
                    dataKucing.add(k);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void riwayatPenitipan() {
        System.out.println("\n    ==========================================");
        System.out.println("                 Riwayat Penitipan            ");
        System.out.println("    ==========================================");
        for (DataKucing cat : dataKucing) {
            System.out.println("     Data Penitipan Kucing ke-" + dataKucing.indexOf(cat) + 1 + " : ");
            System.out.println("     Nama Kucing    : " + cat.getNamaKucing0());
            System.out.println("     Kode Booking   : " + cat.getKodeBooking0());
            System.out.println("     Pelanggan      : " + cat.getPelanggan());
            System.out.println("     Jenis Kucing   : " + cat.getJenisKucing0());
            System.out.println("     Umur Kucing    : " + cat.getUmurKucing0());
            System.out.println("     Berat Badan    : " + cat.getBB0());
            System.out.println("     Warna Bulu     : " + cat.getWarnaBulu0());
            System.out.println("     Jenis Kelamin  : " + cat.getJKelamin0());
            System.out.println("    ==========================================");
        }
    }

    @Override
    public void menu() {
        try {
            while (true) {
                System.out.println("\n    ==========================================");
                System.out.println("                      M E N U                 ");
                System.out.println("    ==========================================");
                System.out.println("    |        1. Lihat Data Booking           |");
                System.out.println("    |        2. Persetujuan Booking          |");
                System.out.println("    |        3. Profil                       |");
                System.out.println("    |        4. Logout                       |");
                System.out.println("    ==========================================");
                System.out.print("\n    Masukkan Pilihan : ");
                pilihan = Integer.parseInt(input.readLine());
                switch (pilihan) {
                    case 1:
                        this.riwayatPenitipan();
                        break;
                    case 2:
                        this.bookingPenitipan();
                        break;
                    case 3:
                        this.profile();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("        SALAH KETIK!!!");
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
