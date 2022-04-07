package Tugas1;

public class bus extends car implements cetakInfoMobil {
    private int jenisBus;
    private jurusan jurusan;
 
    public bus(String merkMobil, String warnaMobil, String noPlat, int tahunKeluaran, int jenisBus, jurusan jurusan) {
        super(merkMobil, warnaMobil, noPlat, tahunKeluaran);
        this.jenisBus = jenisBus;
        this.jurusan = jurusan;
    }
 
    public void setJenisbus(int jenisBus) {
        this.jenisBus = jenisBus;
    }
 
    public int getJenisbus() {
        return jenisBus;
    }
 
    public void setJurusan(jurusan jurusan) {
        this.jurusan = jurusan;
    }
 
    public jurusan getJurusan() {
        return jurusan;
    }
 
    public void print() {
        System.out.println("========== Data Bus ==========");
        cetakmerkMobil(getmerkMobil());
        super.print();
        System.out.println("Jenis Bus        = " + getJenisbus());
        System.out.println("Jurusan          = " + jurusan.getJurusan());
    }
 
    public void keterangan1() {
        System.out.println("Kelas Ekonomi");
    }
 
    public void keterangan2() {
        System.out.println("Kelas Bisnis");
    }
 
    public void keterangan3() {
        System.out.println("Kelas Eksekutif");
    }
 
    void keterangan() {
        if (jenisBus == 1) {
            keterangan1();
        } else if (jenisBus == 2) {
            keterangan2();
        } else if (jenisBus == 3) {
            keterangan3();
        }
    }
 
    @Override
    public void cetakmerkMobil(String x) {
        System.out.println("Nama Merk Mobil  = " + x);
    }
}
