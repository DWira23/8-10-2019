package ASIS2;
import java.util.Scanner;
public class Asis2M {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Antum : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NRP Antum : ");
        int nrp = input.nextInt();
        System.out.print("Masukkan Semester Antum : ");
        int semester = input.nextInt();
        System.out.print("Masukkan IPK Antum : ");
        double ipk = input.nextDouble();
        System.out.println("---------------------------------------");
        
        Asis2 mhs = new Asis2(nrp ,nama ,semester ,ipk);
//        
//        mhs.setNama("NYOMAN WIRA SASMITA");
//        mhs.setNrp(023);
//        mhs.setSemester(3);
//        mhs.setIpk(5.0);
//        
        System.out.println("DATA MAHASISWA\t : ");
        System.out.println("_______________________________________");
        System.out.println("Nama \t\t : " + mhs.getNama());
        System.out.println("NRP \t\t : " + mhs.getNrp());
        System.out.println("Semester \t " + ": " + mhs.getSemester());
        System.out.println("IPK \t\t : " + mhs.getIpk());
    }
}
