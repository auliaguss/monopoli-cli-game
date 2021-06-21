package monopoli;
public class Properti {
    private String jenis;
    private int hargaJual;
    private int hargaBeli;
    private int pajak;
    
    public void setJenis (String jns) {
        this.jenis = jns;
    }
    
    public String getJenis () {
        return jenis;
    }
    
    public void setHargaJual (int hj) {
        this.hargaJual = hj;
    }
    
    public int getHargaJual () {
        return hargaJual;
    }
    
    public void setHargaBeli (int hb) {
        this.hargaBeli = hb;
    }
    
    public int getHargaBeli () {
        return hargaBeli;
    }
    
    public void setPajak (int pjk) {
        this.pajak = pjk;
    }
    
    public int getPajak () {
        return pajak;
    }
}
