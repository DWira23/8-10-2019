package TugasPBO;
public class TesMobil {   
    public static void main(String[] args){
        Mobil M1 = new Mobil();
        Mobil M2 = new Mobil();
        Mobil M3 = new Mobil();
        Mobil M4 = new Mobil();
        
        M1.setBrand("Toyota");
        M1.setHue("Blue\t");
        M1.setType("Minibus");
        M1.setCapacity(2000);
        M1.setAmount(7);
        M1.infoMobil();
        
        M2.setBrand("Daihatsu");
        M2.setHue("Black\t");
        M2.setType("Pick Up");
        M2.setCapacity(1500);
        M2.setAmount(2);
        M2.infoMobil();
        
        M3.setBrand("Suzuki");
        M3.setHue("Silver");
        M3.setType("SUV\t");
        M3.setCapacity(1800);
        M3.setAmount(5);
        M3.infoMobil();
        
        M4.setBrand("Honda\t");
        M4.setHue("Red\t");
        M4.setType("Sedan\t");
        M4.setCapacity(1300);
        M4.setAmount(5);
        M4.infoMobil();   
    }
}