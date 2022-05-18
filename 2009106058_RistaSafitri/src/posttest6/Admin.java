/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Admin extends Akun implements UserA {
    private ArrayList<Pelanggan> dataPelanggan;
    private ArrayList<Pegawai> dataPegawai;
    private InputStreamReader prepare;
    private BufferedReader input;
    private int pilihan;

    public Admin(String username, String password, String nama, String jenisKelamin, String alamat,
            ArrayList<Pelanggan> dataPelanggan, ArrayList<Pegawai> dataPegawai) {
        super(username, password, nama, jenisKelamin, alamat);
        this.dataPelanggan = dataPelanggan;
        this.dataPegawai = dataPegawai;
        this.prepare = new InputStreamReader(System.in);
        this.input = new BufferedReader(prepare);
    }

    @Override
    public void showData() throws IOException {
        System.out.println("\n    ==========================================");
        System.out.println("                  Tampilkan Data              ");
        System.out.println("    ==========================================");
        System.out.println("    |             1. Pegawai                 |");
        System.out.println("    |             2. Pelanggan               |");
        System.out.println("    ==========================================");
        System.out.print("\n    Masukan pilihan : ");
        pilihan = Integer.parseInt(input.readLine());
        if (pilihan == 1) {
            for (int i = 0; i < dataPegawai.size(); i++) {
                System.out.println("\n    Pegawai ke - " + (i + 1));
                dataPegawai.get(i).profile();
            }
        } else {
            for (int i = 0; i < dataPelanggan.size(); i++) {
                System.out.println("\n    Pelanggan ke - " + (i + 1));
                dataPelanggan.get(i).profile();
            }
        }
    }

    @Override
    public void addData() throws IOException {
        System.out.println("\n    ==========================================");
        System.out.println("                    Tambah Data               ");
        System.out.println("    ==========================================");
        System.out.println("    |               1. Pegawai               |");
        System.out.println("    |               2. Pelanggan             |");
        System.out.println("    ==========================================");
        System.out.print("\n    Masukan pilihan : ");
        pilihan = Integer.parseInt(input.readLine());
        if (pilihan == 1) {
            System.out.print("\n    Masukan Nama          : ");
            String nama = input.readLine();
            System.out.print("    Masukan Jenis Kelamin : ");
            String jenisKelamin = input.readLine();
            System.out.print("    Masukan Alamat        : ");
            String alamat = input.readLine();
            System.out.print("    Masukan Nomor Telepon : ");
            String telp0 = input.readLine();
            dataPegawai.add(new Pegawai(telp0, "54321", nama, jenisKelamin, alamat,
                    telp0));
        } else {
            System.out.print("\n    Masukan Nama          : ");
            String nama = input.readLine();
            System.out.print("    Masukan Nomor Telepon : ");
            String telp = input.readLine();
            System.out.print("    Masukan Jenis Kelamin : ");
            String jenisKelamin = input.readLine();
            System.out.print("    Masukan Alamat        : ");
            String alamat = input.readLine();
            dataPelanggan.add(new Pelanggan(telp, "12345", nama, telp, jenisKelamin, alamat));
        }
    }

    @Override
    public void updateData() throws IOException {
        System.out.println("\n    ==========================================");
        System.out.println("                    Update Data               ");
        System.out.println("    ==========================================");
        System.out.println("    |               1. Pegawai               |");
        System.out.println("    |               2. Pelanggan             |");
        System.out.println("    ==========================================");
        System.out.print("\n    Masukan pilihan : ");
        pilihan = Integer.parseInt(input.readLine());
        if (pilihan == 1) {
            System.out.print("\n    Masukan Nama Pegawai : ");
            String nama = input.readLine();
            for (Pegawai i : dataPegawai) {
                if (i.getNama().equals(nama)) {
                    System.out.print("\n    Masukan Nama Baru          : ");
                    i.setNama(input.readLine());
                    System.out.print("    Masukan Jenis Kelamin Baru : ");
                    i.setJenisKelamin(input.readLine());
                    System.out.print("    Masukan Alamat Baru        : ");
                    i.setAlamat(input.readLine());
                    System.out.print("    Masukan Nomor Telepon Baru : ");
                    i.setTelp0(input.readLine());
                }
            }
        } else {
            System.out.print("\n    Masukan Nama Pelanggan : ");
            String nama = input.readLine();
            for (Pelanggan i : dataPelanggan) {
                if (i.getNama().equals(nama)) {
                    System.out.print("\n    Masukan Nama Baru          : ");
                    i.setNama(input.readLine());
                    System.out.print("    Masukan Jenis Kelamin Baru : ");
                    i.setJenisKelamin(input.readLine());
                    System.out.print("    Masukan Alamat Baru        : ");
                    i.setAlamat(input.readLine());
                    System.out.print("    Masukan Nomor Telepon Baru : ");
                    i.setTelp(input.readLine());
                }
            }
        }
    }

    @Override
    public void deleteData() throws IOException {
        System.out.println("\n    ==========================================");
        System.out.println("                    Hapus Data                ");
        System.out.println("    ==========================================");
        System.out.println("    |               1. Pegawai               |");
        System.out.println("    |               2. Pelanggan             |");
        System.out.println("    ==========================================");
        System.out.print("\n    Masukan pilihan : ");
        pilihan = Integer.parseInt(input.readLine());
        if (pilihan == 1) {
            System.out.print("\n    Masukan Nama Pegawai : ");
            String nama = input.readLine();
            for (Pegawai i : dataPegawai) {
                if (i.getNama().equals(nama)) {
                    dataPegawai.remove(i);
                }
            }
        } else {
            System.out.print("\n    Masukan Nama Pelanggan : ");
            String nama = input.readLine();
            for (int i = 0; i < dataPelanggan.size(); i++) {
                if (dataPelanggan.get(i).getNama().equals(nama)) {
                    dataPelanggan.remove(i);
                }
            }
        }
    }

    @Override
    public void menu() throws IOException {
        while (true) {
            System.out.println("\n    ==========================================");
            System.out.println("        Kelola Data Pegawai & Pelanggan       ");
            System.out.println("    ==========================================");
            System.out.println("    |      1. Create Data                    |");
            System.out.println("    |      2. Read Data                      |");
            System.out.println("    |      3. Update Data                    |");
            System.out.println("    |      4. Delete Data                    |");
            System.out.println("    |      5. Exit                           |");
            System.out.println("    ==========================================");
            System.out.print("\n    Masukkan Pilihan : ");
            int menu = Integer.parseInt(input.readLine());
            switch (menu) {
                case 1:
                    this.addData();
                    break;
                case 2:
                    this.showData();
                    break;
                case 3:
                    this.updateData();
                    break;
                case 4:
                    this.deleteData();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("        SALAH KETIK!!!");
                    break;
            }
        }
    }
}
