package ASIS4;
public class pesawat extends Latihan1 {
    private String nama, jenis;
    public pesawat(String nama){
        super("Pesawat");
        this.nama = nama;
        jenis = "belum teridentifikasi";
    }
    
    public pesawat(String nama, String jenis){
        super("Pesawat");
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void informasi(){
        System.out.println("Nama pesawat adalah " + nama);
        System.out.println("Jenis pesawat adalah " + jenis);
        super.informasi();
    }
}