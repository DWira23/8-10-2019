package TugasPBO;
public class Mobil {
    private String Brand, Type, Hue;
    private int Capacity, Amount;
    
    Mobil(){
        this.Brand      = " ";
        this.Type       = " ";
        this.Hue        = " ";
        this.Capacity   = 0;
        this.Amount     = 0;
    }
    
    Mobil(String B, String T, String H){
        this.Brand  = B;
        this.Type   = T;
        this.Hue    = H;
    }
    
    void setBrand(String B){
        this.Brand  = B;
    }
    
    void setType(String T){
        this.Type   = T;
    }
    
    void setHue(String H){
        this.Hue    = H;
    }
    
    void setCapacity(int C){
        this.Capacity   = C;
    }
    
    void setAmount(int A){
        this.Amount     = A;
    }
    
    String getBrand(){
        return this.Brand;
    }
    
    String getType(){
        return this.Type;
    }
    
    String getHue(){
        return this.Hue;
    }
    
    int getCapacity(){
        return this.Capacity;
    }
    
    int getAmount(){
        return this.Amount;
    }
    
    void infoMobil(){
        System.out.println("_________________________________________________");
        System.out.println("| Brand\t\t: " + getBrand() + "\t\t\t|");
        System.out.println("| Type\t\t: " + getType() + "\t\t\t|");
        System.out.println("| Colour\t: " + getHue() + "\t\t\t|");
        System.out.println("| Capacity\t: " + getCapacity() + "\t\t\t\t|");
        System.out.println("| Amount\t: " + getAmount() + "\t\t\t\t|");
        System.out.println("_________________________________________________\n");
    }
}
