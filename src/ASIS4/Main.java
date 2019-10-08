package ASIS4;
public class Main {
    public static void main(String[] args) {
        Latihan1 P;
        pesawat psw = new pesawat("Boeing 707" , "Pesawat Komersial");
        mobil mbl1 = new mobil("Toyota Kijang" , "Jeep");
        mobil mbl2 = new mobil("Suzuki Baleno" , "Sedan");
        mobil mbl3 = new mobil("VW Combi");
        kapal kpl = new kapal("Queen Marry II" , "Kapal Pesiar");
        
        System.out.println("====================Pesawat====================");
        P=psw;
        P.informasi();
        System.out.println("\n====================Mobil====================");
        P=mbl1;
        P.informasi();
        System.out.println("\n====================Mobil====================");
        P=mbl2;
        P.informasi();
        System.out.println("\n====================Mobil====================");
        P=mbl3;
        P.informasi();
        System.out.println("\n====================Kapal====================");
        P=kpl;
        P.informasi();
    }
}
