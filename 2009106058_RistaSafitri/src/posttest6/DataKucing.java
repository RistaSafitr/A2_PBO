/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import java.util.ArrayList;

public class DataKucing {

    static Iterable<DataKucing> getDataKucing() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String namaKucing0;
    private String kodeBooking0;
    private String pelanggan;
    private String jenisKucing0;
    private String umurKucing0;
    private String BB0;
    private String warnaBulu0;
    private String jKelamin0;
    private static ArrayList<DataKucing> dataKucing = new ArrayList<>();;

    public DataKucing(String namaKucing0, String kodeBooking0, String pelanggan, 
            String jenisKucing0, String umurKucing0, String BB0, String warnaBulu0, String jKelamin0) {
        this.namaKucing0 = namaKucing0;
        this.kodeBooking0 = kodeBooking0;
        this.pelanggan = pelanggan;
        this.jenisKucing0 = jenisKucing0;
        this.umurKucing0 = umurKucing0;
        this.BB0 = BB0;
        this.warnaBulu0 = warnaBulu0;
        this.jKelamin0 = jKelamin0;
        dataKucing.add(this);
    }

    public static ArrayList<DataKucing> getDataCat() {
        return dataKucing;
    }

    public static void displayKelas() {
        if (dataKucing.isEmpty()) {
            System.out.println("    Tidak Ada Riwayat Penitipan");
        } else {
            for (DataKucing k : dataKucing) {
                System.out.println("\n    ==============================================");
                System.out.println("         DATA PENITIPAN HEWAN YANG DITAMBAHKAN    ");
                System.out.println("    ==============================================");
                System.out.println("     Nama Kucing    : " + k.namaKucing0);
                System.out.println("     Kode Booking   : " + k.kodeBooking0);
                System.out.println("     Pelanggan      : " + k.pelanggan);
                System.out.println("     Jenis Kucing   : " + k.jenisKucing0);
                System.out.println("     Umur Kucing    : " + k.umurKucing0);
                System.out.println("     Berat Badan    : " + k.BB0);
                System.out.println("     Warna Bulu     : " + k.warnaBulu0);
                System.out.println("     Jenis Kelamin  : " + k.jKelamin0);
                System.out.println("    ==============================================");
            }
        }
    }

    public static void updateKelas(String namaKucing, String kodeBooking, 
            String pelanggan, String jenisKucing0, String umurKucing0, String BB0, 
            String warnaBulu0, String jKelamin0) {
        for (DataKucing k : dataKucing) {
            if (k.namaKucing0.equals(namaKucing) && k.kodeBooking0.equals(kodeBooking)) {
                k.pelanggan = pelanggan;
                k.jenisKucing0 = jenisKucing0;
                k.umurKucing0 = umurKucing0;
                k.BB0 = BB0;
                k.warnaBulu0 = warnaBulu0;
                k.jKelamin0 = jKelamin0;
            }
        }
    }

    DataKucing(String namaKucing, String jenisKucing, String umurKucing, String BB, String warnaBulu, String kodeBooking, String nama) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNamaKucing0() {
        return namaKucing0;
    }

    public void setNamaKucing0(String namaKucing0) {
        this.namaKucing0 = namaKucing0;
    }

    public String getKodeBooking0() {
        return kodeBooking0;
    }

    public void setKodeBooking0(String kodeBooking0) {
        this.kodeBooking0 = kodeBooking0;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }
    

//    Object getPelanggan() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    public String getJenisKucing0() {
        return jenisKucing0;
    }

    public void setJenisKucing0(String jenisKucing0) {
        this.jenisKucing0 = jenisKucing0;
    }

    public String getUmurKucing0() {
        return umurKucing0;
    }

    public void setUmurKucing0(String umurKucing0) {
        this.umurKucing0 = umurKucing0;
    }

    public String getBB0() {
        return BB0;
    }

    public void setBB0(String BB0) {
        this.BB0 = BB0;
    }

    public String getWarnaBulu0() {
        return warnaBulu0;
    }

    public void setWarnaBulu0(String warnaBulu0) {
        this.warnaBulu0 = warnaBulu0;
    }

    public String getjKelamin0() {
        return jKelamin0;
    }

    public void setjKelamin0(String jKelamin0) {
        this.jKelamin0 = jKelamin0;
    }

    String getJKelamin0() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}