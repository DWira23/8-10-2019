package ASIS1;
public class Asis1 {
    String ID, Nama, Divisi;
    double Gaji;

        void CetakData(){
        System.out.println("Data Karyawan");
        System.out.println("ID\t\t: " + ID);
        System.out.println("Nama\t\t: " + Nama);
        System.out.println("Divisi\t\t: " + Gaji);
    }
  
    
    double HitungSumbanganZakat(){
        double Zakat = Gaji*0.025;
        return Zakat;
    }
}
