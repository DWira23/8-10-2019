package ASIS4;
public class kapal extends Latihan1 {
    private String nama, jenis;
    public kapal(String nama){
        super("Kapal");
        this.nama = nama;
        jenis = "belum teridentifikasi";
    }
    
    public kapal(String nama, String jenis){
        super("Kapal");
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void informasi(){
        System.out.println("Nama kapal adalah " + nama);
        System.out.println("Jenis kapal adalah " + jenis);
        super.informasi();
    }
}
