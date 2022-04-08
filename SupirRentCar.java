package Tugas1;

public class SupirRentCar extends Karyawan implements CetakInfoKaryawan {
    private int usia;
    private Jurusan jurusan;
 
    public SupirRentCar(String n, String A, String jK, String noTlp,String tanggalMasuk, int usia, Jurusan jurusan) {
        super(n, A, jK, noTlp, tanggalMasuk);
        this.usia = usia;
        this.jurusan = jurusan;
    }
 
    public void setUsia(int usia) {
        this.usia = usia;
    }
 
    public int getUsia() {
        return usia;
    }
 
    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }
 
    public Jurusan getJurusan() {
        return jurusan;
    }
 
    public void keterangan1() {
        System.out.println("Senior");
    }
 
    public void keterangan2() {
        System.out.println("Pemula");
    }
 
    public void keterangan3() {
        System.out.println("Pendaftar");
    }
 
    public void keterangan4() {
        System.out.println("Purna Tugas");
    }
 
    public void print() {
        System.out.println("====== Data Supir Rent Car ======");
        cetakTanggalMasuk(getTanggalMasuk());
        super.print();
        System.out.println("Usia          = " + usia);
        System.out.println("Jurusan       = " +jurusan.getJurusan());
    }
 
    void keterangan() {
        if (usia > 40) {
            keterangan4();
        } else if (usia > 30) {
            keterangan1();
        } else if (usia > 25) {
            keterangan2();
        } else if (usia > 20) {
            keterangan3();
        } else {
            System.out.println("Belum cukup umur");
        }
    }
 
    @Override
    public void cetakTanggalMasuk(String x) {
        System.out.println("Tanggal Masuk = " + x);
 
    }
}