package Tugas1;

public class Admin extends Karyawan implements CetakInfoKaryawan {
    private int divisi;
 
    public Admin(String nama, String alamat, String jenisKelamin, String noTlp, String tanggalMasuk, int divisi) {
        super(nama, alamat, jenisKelamin, noTlp, tanggalMasuk);
        this.divisi = divisi;
    }
 
    public void setdivisi(int divisi) {
        this.divisi = divisi;
    }
 
    public int getdivisi() {
        return divisi;
    }
 
    public void print() {
        System.out.println("====== Data Admin ======");
        cetakTanggalMasuk(getTanggalMasuk());
        super.print();
    }
 
    public void keterangan1() {
        System.out.println("Divisi    = Admin Garasi");
    }
 
    public void keterangan2() {
        System.out.println("Divisi    = Admin Bendahara");
    }
 
    public void keterangan3() {
        System.out.println("Divisi    = Admin Data");
    }
 
    void keterangan() {
        if (divisi == 1) {
            keterangan1();
        } else if (divisi == 2) {
            keterangan2();
        } else if (divisi == 3) {
            keterangan3();
        }
    }
 
    @Override
    public void cetakTanggalMasuk(String x) {
        System.out.println("Tanggal Masuk = " + x);
 
    }
 
}
