package ASIS1;
public class Asis1C {
    public static void main(String[]args){
        Asis1 Karyawan001 = new Asis1();
//        Asis1 Karyawan002 = Karyawan001;
        Asis1 Karyawan002 = new Asis1();
        Karyawan001.Nama = "Michelle";
        Karyawan001.Divisi = "HRD";
        
        Karyawan002.Nama = "Wellbeck";
        Karyawan002.Divisi = "Marketing";
        System.out.println(" _______________________________________________");
        System.out.println("|               Data Karyawan001                |");
        System.out.println("|           Nama\t: " + Karyawan001.Nama + "\t\t|");
        System.out.println("|           Divisi\t: " + Karyawan001.Divisi + "\t\t\t|");
        System.out.println("-------------------------------------------------");
        System.out.println("|               Data Karyawan002                |");
        System.out.println("|           Nama\t: " + Karyawan002.Nama + "\t\t|");
        System.out.println("|           Divisi\t: " + Karyawan002.Divisi + "\t\t|");
        System.out.println("|_______________________________________________|");
    }

}
