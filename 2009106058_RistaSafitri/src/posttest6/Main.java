/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static InputStreamReader prepare = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(prepare);
    static int pilihan;

    public static void main(String[] args) throws IOException {
        ArrayList<Pegawai> dataPegawai = new ArrayList<>();
        ArrayList<Pelanggan> dataPelanggan = new ArrayList<>();
        dataPelanggan.add(new Pelanggan("Aria123", "12345", "Aria", "Perempuan", "Jl. Soekarno Hatta", "082322223333"));
        dataPegawai.add(new Pegawai("Pegawai", "54321", "Mas Pegawai", "Laki-laki", "Jl. Kemakmuran", "083233332222"));
        Admin admin = new Admin("ADMIN", "00000", "BOS ADMIN", "Laki - Laki", "Jl. Kemayoran", dataPelanggan, dataPegawai);
        while (true) {
            System.out.println("    ==========================================");
            System.out.println("    Selamat Datang di Website Penitipan Kucing");
            System.out.println("    ==========================================");
            System.out.println("    |               1. Login                 |");
            System.out.println("    |               2. Logout                |");
            System.out.println("    ==========================================");
            System.out.println(" ");
            System.out.print("    Masukan Pilihan : ");
            pilihan = Integer.parseInt(input.readLine());
            if (pilihan == 1) {
                System.out.println(" ");
                System.out.print("    USERNAME : ");
                String username = input.readLine();
                System.out.print("    PASSWORD : ");
                String password = input.readLine();
                if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
                    admin.menu();
                    continue;
                }
                for (Pelanggan pelanggan : dataPelanggan) {
                    if (username.equals(pelanggan.getUsername()) && password.equals(pelanggan.getPassword())) {
                        pelanggan.menu();
                        continue;
                    }
                }
                for (Pegawai pegawai : dataPegawai) {
                    if (username.equals(pegawai.getUsername()) && password.equals(pegawai.getPassword())) {
                        pegawai.menu();
                        continue;
                    }
                }
                System.out.println("\n        USERNAME ATAU PASSWORD SALAH !!!");
            } else {
                System.out.println("\n        HAVE A GOOD DAY, BYE BYE ^-^");
                break;
            }
        }
    }
}
