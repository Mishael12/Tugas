package Tugas1;

public class mobilPribadi extends car implements cetakInfoMobil {
    private int kapasitas;
    private jurusan jurusan;
 
    public mobilPribadi(String merkMobil, String warnaMobil, String noPlat, int tahunKeluaran, int kapasitas, jurusan jurusan) {
        super(merkMobil, warnaMobil, noPlat, tahunKeluaran);
        this.kapasitas = kapasitas;
        this.jurusan = jurusan;
    }
 
    public void print() {
        System.out.println("====== Data Mobil Pribadi ======");
        cetakmerkMobil(getmerkMobil());
        super.print();
        System.out.println("Kapasitas        = " + getKapasitas());
        System.out.println("Jurusan          = " + jurusan.getJurusan());
    }
 
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
 
    public int getKapasitas() {
        return kapasitas;
    }
 
    public void setJurusan(jurusan jurusan) {
        this.jurusan = jurusan;
    }
 
    public jurusan getJurusan() {
        return jurusan;
    }
 
    public void keterangan1() {
        System.out.println("Sewa Sopir");
    }
 
    public void keterangan2() {
        System.out.println("Bawa Sendiri");
    }
 
    void keterangan() {
        if (kapasitas > 5) {
            keterangan1();
        } else {
            keterangan2();
        }
    }
 
    @Override
    public void cetakmerkMobil(String x) {
        System.out.println("Nama Merk Mobil  = " + x);
    }
}