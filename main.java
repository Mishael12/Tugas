package Tugas1;

public class main {
    /*
     * instanceOf diubah karena nilai kapasitas/umurPemakaian/jenisBus
     * Tidak terbaca, pemilihan keterangan langsung berada pada class masing2
     */
    static void staff(karyawan k){
        if (k instanceof admin){

        }
    }

    static void Mobil(car c) {
        if (c instanceof mobilPribadi) {
            mobilPribadi mP = (mobilPribadi) c;
            mP.keterangan();
        } else if (c instanceof miniBus) {
            car mB = (miniBus) c;
            mB.keterangan();
        } else if (c instanceof bus) {
            bus B = (bus) c;
            B.keterangan();
        }
    }
 
    public static void main(String[] args) {

        jurusan[] daftarJurusan = jurusan.values();
        System.out.println("==========================");
        System.out.println("Daftar Jurusan : ");
        try {
            for (int i = 0; i < daftarJurusan.length + 1; i++) {
                System.out.println((i + 1) + ". " + daftarJurusan[i].getJurusan());
            }
            System.out.println("--------------------------");
 
        } catch (ArrayIndexOutOfBoundsException aException) {
            System.out.println("Tidak ada data tersebut!");
            System.out.println("--------------------------");
        }
        System.out.println("Seluruh jadwal telah ditunjukan.");

        mobilPribadi car1 = new mobilPribadi("honda", "Merah", "N 2003 N", 1923, 3, jurusan.Madura_Malang);
        car1.print();
        Mobil(car1);
        System.out.println();
        miniBus miniBus1 = new miniBus("Toyota", "Silver", "N 199 A", 2010, 2, jurusan.Surabaya_Malang);
        miniBus1.print();
        Mobil(miniBus1);
        System.out.println();
        bus bus1 = new bus("Volvo", "Hijau", "N 188 ER", 2020, 1, jurusan.Surabaya_Malang);
        bus1.print();
        Mobil(bus1);
        System.out.println();
        miniBus miniBus2 = new miniBus("Honda", "Abu-Abu", "N 3425 FA", 2013, 4, jurusan.Madura_Malang);
        miniBus2.print();
        Mobil(miniBus2);
        System.out.println();
        try{
            mobilPribadi car2 = new mobilPribadi("Mercedes", "Hitam", "S 2312 BA", 2003, 3, jurusan.values()[5]);
            car2.print();
        }catch(ArrayIndexOutOfBoundsException aException){
            System.out.println("--------------------------");
            System.out.println("Tidak Ada data Tersebut");
            System.out.println("--------------------------");
        }
 
        System.out.println();
 
        
 
        
    }
}