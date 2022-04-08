package Tugas1;

public class Karyawan {
    String nama;
    String alamat;
    String noTlp;
    String jenisKelamin;
    int noKategori;
    String tanggalMasuk;
 
    // Object
    Karyawan(String n, String A, String jK, String noTlp, String tanggalMasuk) {
        this.nama = n;
        this.alamat = A;
        this.jenisKelamin = jK;
        this.noTlp = noTlp;
        this.tanggalMasuk = tanggalMasuk;
    }
 
    void setTanggalMasuk(String tanggalMasuk){
        this.tanggalMasuk = tanggalMasuk;
    }

    String getTanggalMasuk(){
        return tanggalMasuk;
    }
    public void setNama(String n) {
        this.nama = n;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setAlamat(String A) {
        this.alamat = A;
    }
 
    public String getAlamat() {
        return alamat;
    }
 
    public void setJeniskelamin(String jK) {
        this.jenisKelamin = jK;
    }
 
    public String getJeniskelamin() {
        return jenisKelamin;
    }
 
    public void setNotlp(String noTlp) {
        this.noTlp = noTlp;
    }
 
    public String getNotlp() {
        return noTlp;
    }
 
    public void setNokategori(int noKategori) {
        this.noKategori = noKategori;
    }
 
    public int getNokategori() {
        return noKategori;
    }
 
    void print() {
        System.out.println("Nama Karyawan = " + nama);
        System.out.println("Alamat        = " + alamat);
        System.out.println("Jenis Kelamin = " + jenisKelamin);
        System.out.println("No Telephone  = " + noTlp);
    }
 
    void keterangan() {
 
    }
}