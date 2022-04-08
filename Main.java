package Tugas1;


public class Main{
    /*
     * instanceOf diubah karena nilai kapasitas/umurPemakaian/jenisBus
     * Tidak terbaca, pemilihan keterangan langsung berada pada class masing2
     */
    static void staff(Karyawan k){
        if (k instanceof Admin){
            Admin aD = (Admin) k;
            aD.keterangan();
        }else if(k instanceof SupirTravel){
            SupirTravel aT = (SupirTravel)k;
            aT.keterangan();
        }else if(k instanceof SupirRentCar){
            SupirRentCar sR = (SupirRentCar)k;
            sR.keterangan();
        }
    }

    static void Mobil(Mobil c) {
        if (c instanceof MobilPribadi) {
            MobilPribadi mP = (MobilPribadi) c;
            mP.keterangan();
        } else if (c instanceof MiniBus) {
            Mobil mB = (MiniBus) c;
            mB.keterangan();
        } else if (c instanceof Bus) {
            Bus B = (Bus) c;
            B.keterangan();
        }
    }
 
    public static void main(String[] args) {
        //Bagian Karyawan
        Jurusan[] daftarJurusan = Jurusan.values();
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
        System.out.println("=========================");
        System.out.println("Bagian Karyawan");
        System.out.println("=========================");
        Admin admin = new Admin("Bambang", "Malang", "Laki", "0834981", "12 Maret 2003", 2);
        admin.printAdmin();
        staff(admin);
        System.out.println();
        
        SupirRentCar sR = new SupirRentCar("Ubang", "Surabaya", "Perempuan", "3983902", "13 Desember 1923", 23, Jurusan.Banyuwangi_Malang);
        sR.print();
        staff(sR);
        System.out.println();

        SupirTravel sT = new SupirTravel("Mamang", "Bandung", "Laki", "3812841", "14 Maret 1932", 2011, Jurusan.Situbondo_Malang);
        sT.print();
        staff(sT);
        System.out.println();

        try{
            SupirRentCar sR2 = new SupirRentCar("Ubang", "Surabaya", "Perempuan", "3983902", "13 Desember 1923", 23, Jurusan.values()[5]);
            sR2.print();
            staff(sR2);
        }catch(ArrayIndexOutOfBoundsException aException){
            System.out.println("--------------------------");
            System.out.println("Tidak Ada data Tersebut");
            System.out.println("Tolong Periksa Kembali !");
            System.out.println("--------------------------");
        }

        
        //Bagian Mobil
        System.out.println("==========================");
        System.out.println("Bagian Mobil");
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

        MobilPribadi car1 = new MobilPribadi("honda", "Merah", "N 2003 N", 1923, 3, Jurusan.Madura_Malang);
        car1.print();
        Mobil(car1);
        System.out.println();
        MiniBus miniBus1 = new MiniBus("Toyota", "Silver", "N 199 A", 2010, 2, Jurusan.Surabaya_Malang);
        miniBus1.print();
        Mobil(miniBus1);
        System.out.println();
        Bus bus1 = new Bus("Volvo", "Hijau", "N 188 ER", 2020, 1, Jurusan.Surabaya_Malang);
        bus1.print();
        Mobil(bus1);
        System.out.println();
        MiniBus miniBus2 = new MiniBus("Honda", "Abu-Abu", "N 3425 FA", 2013, 4, Jurusan.Madura_Malang);
        miniBus2.print();
        Mobil(miniBus2);
        System.out.println();
        try{
            MobilPribadi car2 = new MobilPribadi("Mercedes", "Hitam", "S 2312 BA", 2003, 3, Jurusan.values()[5]);
            car2.print();
        }catch(ArrayIndexOutOfBoundsException aException){
            System.out.println("--------------------------");
            System.out.println("Tidak Ada data Tersebut");
            System.out.println("Tolong Periksa Kembali !");
            System.out.println("--------------------------");
        }
 
        System.out.println();
 
        
 
        
    }
}