/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import java.io.IOException;
import java.util.ArrayList;

public class Pelanggan extends Akun implements UserB, UserC {
    private ArrayList<DataKucing> dataKucing;
    private String telp;

    // Constructor
    public Pelanggan(String username, String password, String nama, String jenisKelamin, String alamat, String telp) {
        super(username, password, nama, jenisKelamin, alamat);
        this.telp = telp;
        dataKucing = new ArrayList<>();
    }

    // Setter & Getter
    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public ArrayList<DataKucing> getDataKucing() {
        return dataKucing;
    }

    public void setDataKucing(ArrayList<DataKucing> dataKucing) {
        this.dataKucing = dataKucing;
    }

    @Override
    public void profile() {
        System.out.println("    ==========================================");
        super.profile();
        System.out.println("    Telepon       : " + this.telp);
        System.out.println("    ==========================================");
    }

    @Override
    public void bookingPenitipan() {
        try {
            DataKucing.displayKelas();
            System.out.println("    Masukan Kode Booking : ");
            String kodeBooking = input.readLine();
            for (DataKucing k : DataKucing.getDataKucing()) {
                if (k.getKodeBooking0().equals(kodeBooking) && !k.getPelanggan().equals(this.nama)) {
                    dataKucing.add(k);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void buatPesanan() {
        try {
            System.out.print("    Masukan Nama Kucing    : ");
            String namaKucing = input.readLine();
            System.out.print("    Masukkan Jenis Kucing  : ");
            String jenisKucing = input.readLine();
            System.out.print("    Masukkan Umur kucing   : ");
            String umurKucing = input.readLine();
            System.out.print("    Masukkan Berat Badan   : ");
            String BB = input.readLine();
            System.out.print("    Masukkan Warna Bulu    : ");
            String warnaBulu = input.readLine();
            System.out.print("    Masukkan Jenis Kelamin : ");
            String jKelamin = input.readLine();
            System.out.print("    Masukan Kode Booking   : ");
            String kodeBooking = input.readLine();
            this.dataKucing.add(new DataKucing(namaKucing, kodeBooking, this.nama, jenisKucing, umurKucing, BB, warnaBulu, jKelamin));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void hapusPesanan() {
        try {
            if (this.dataKucing.isEmpty()) {
                System.out.println("    Tidak Ada Riwayat Data Penitipan");
            } else {
                System.out.print("    Masukan Kode Booking : ");
                String kodeBooking;
                kodeBooking = input.readLine();
                for (int i = 0; i < this.dataKucing.size(); i++) {
                    if (this.dataKucing.get(i).getNamaKucing0().equals(kodeBooking)) {
                        this.dataKucing.remove(i);
                        System.out.println("    Data Penitipan Hewan Terkait Berhasil di Hapus....");
                        return;
                    }
                }
                System.out.println("    Data Tidak Ditemukan!!!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void riwayatPenitipan() {
        if (this.dataKucing.isEmpty()) {
            System.out.println("    Pelanggan : " + this.nama + " Belum Memiliki Riwayat Penitipan Hewan");
        } else {
            System.out.println("\n    ==========================================");
            System.out.println("                  Riwayat Penitipan           ");
            System.out.println("    ==========================================");
            for (DataKucing cat : this.dataKucing) {
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
    }

    @Override
    public void ubahPesanan() {
        try {
            if (this.dataKucing.isEmpty()) {
                System.out.println("\n    Pelanggan : " + this.nama + " Belum Memiliki Riwayat Penitipan");
            } else {
                System.out.print("\n    Masukan Nama Kucing  : ");
                String namaKucing;
                namaKucing = input.readLine();
                System.out.print("    Masukan Kode Booking : ");
                String kodeBooking = input.readLine();
                for (int i = 0; i < this.dataKucing.size(); i++) {
                    if (this.dataKucing.get(i).getNamaKucing0().equals(namaKucing)) {
                        this.dataKucing.get(i).setNamaKucing0(namaKucing);
                        this.dataKucing.get(i).setKodeBooking0(kodeBooking);
                        System.out.println("\n    Data Berhasil Diupdate....");
                        return;
                    }
                }
                System.out.println("\n    Data Tidak Ditemukan!!!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void menu() {
        try {
            while (true) {
                DataKucing.displayKelas();
                System.out.println("\n    ==========================================");
                System.out.println("                     M E N U                  ");
                System.out.println("    ==========================================");
                System.out.println("    |       1. Lihat Riwayat Penitipan       |");
                System.out.println("    |       2. Tambah Data Penitipan         |");
                System.out.println("    |       3. Hapus Data Penitipan          |");
                System.out.println("    |       4. Pengguna                      |");
                System.out.println("    |       5. Logout                        |");
                System.out.println("    ==========================================");
                System.out.print("\n    Masukkan Pilihan : ");
                pilihan = Integer.parseInt(input.readLine());
                switch (pilihan) {
                    case 1:
                        this.riwayatPenitipan();
                        break;
                    case 2:
                        this.buatPesanan();
                        break;
                    case 3:
                        this.hapusPesanan();
                        break;
                    case 4:
                        this.profile();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("        SALAH KETIK!!!");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
