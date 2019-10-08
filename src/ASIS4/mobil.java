package ASIS4;
public class mobil extends Latihan1 {
    private String nama,jenis;
    
    public mobil(String nama){
        super("Mobil");
        this.nama = nama;
        jenis = "belum teridentifikasi";
    }
    
    public mobil(String nama, String jenis){
        super("Mobil");
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void informasi(){
        System.out.println("Nama mobil adalah " + nama);
        System.out.println("Jenis mobil adalah " + jenis);
        super.informasi();
    }
}
