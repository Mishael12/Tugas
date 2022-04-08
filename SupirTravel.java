package Tugas1;

public class SupirTravel extends Karyawan implements CetakInfoKaryawan {
    private int masaSim;
    private Jurusan jurusan;
 
    public SupirTravel(String n, String A, String jK, String noTlp, String tanggalMasuk, int masaSim, Jurusan jurusan) {
        super(n, A, jK, noTlp, tanggalMasuk);
        this.masaSim = masaSim;
        this.jurusan = jurusan;
    }
 
    public void setMasasim(int masaSim) {
        this.masaSim = masaSim;
    }
 
    public int getMasasim() {
        return masaSim;
    }
 
    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }
 
    public Jurusan getJurusan() {
        return jurusan;
    }
 
    public void keterangan1() {
        System.out.println("Bisa Digunakan");
    }
 
    public void keterangan2() {
        System.out.println("Belum Bisa digunakan");
    }
 
    public void print() {
        System.out.println("====== Data Supir Travel ======");
        cetakTanggalMasuk(getTanggalMasuk());
        super.print();
        System.out.println("Masa Sim     = " + masaSim);
        System.out.println("Jurusan      = " +jurusan.getJurusan());
    }
 
    void keterangan() {
        if (masaSim > 2010) {
            keterangan1();
        } else {
            keterangan2();
        }
    }
 
    @Override
    public void cetakTanggalMasuk(String x) {
        System.out.println("Tanggal Masuk     = " + x);
 
    }
 
}
