package ASIS1;
public class Asis1Karyawan {
    public static void main(String[]args){
        Asis1 karyawan001 = new Asis1();
        karyawan001.ID = "K001";
        karyawan001.Nama = "Agus Ramadhan";
        karyawan001.Divisi = "Keuangan";
        karyawan001.Gaji = 1850000;
        
        karyawan001.CetakData();
        
        System.out.println("Sumbangan Zakat : " + karyawan001.HitungSumbanganZakat());
    }
}
