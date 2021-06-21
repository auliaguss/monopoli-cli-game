package monopoli;

import java.util.ArrayList;

public class Kartu extends Papan {
    private int hargaBeli;
    private int hargaJual;
    private String nama;
    private int pajak;
    
    
    public ArrayList<KartuIstimewa> ks=new ArrayList<>();
    public ArrayList<KartuIstimewa> kartu;
        
    public void printKartuTanah(int posisi){
        System.out.println("=========================");
        System.out.println("\t "+this.listPetak.get(posisi).getNamaTempat());
        System.out.println("Harga Sewa = $"+this.listPetak.get(posisi).getHargaSewa());
        System.out.println("Harga Rumah = $"+this.listPetak.get(posisi).getHargaRumah());
        System.out.println("Harga Hotel = $"+this.listPetak.get(posisi).getHargaHotel());
        System.out.println("Harga Hipotik = $"+this.listPetak.get(posisi).getHargaHipotik());
        System.out.println("=========================");
    }    
        
    public Kartu(){
        //nama perintah kondiisi komisi
        kartu = new ArrayList<>();
        kartu.add(new KartuIstimewa("Dana Umum", "Anda mendapatkan poin belanja $20000", 20000));
        kartu.add(new KartuIstimewa("Dana Umum", "Selamat Ulang Tahun! Terima kado $1000 dari bank.", 1000));
        kartu.add(new KartuIstimewa("Dana Umum", "Bayar salon $5000", -5000));
        kartu.add(new KartuIstimewa("Dana Umum", "Masuk penjara!", 0));
        kartu.add(new KartuIstimewa("Dana Umum", "Bayar $10000 atau mengambil Kesempatan", -10000));
        kartu.add(new KartuIstimewa("Dana Umum", "Terima komisi $5000", 5000));
        kartu.add(new KartuIstimewa("Dana Umum", "Bayar tagihan kartu kredit $10000", -10000));
        kartu.add(new KartuIstimewa("Dana Umum", "Bayar asuransi $2000", -2000));
        kartu.add(new KartuIstimewa("Dana Umum", "Dapat THR $5000", 5000));
        kartu.add(new KartuIstimewa("Dana Umum", "Maju sampai Start", 0));
        kartu.add(new KartuIstimewa("Dana Umum", "Dapat voucher $10000", 10000));
        kartu.add(new KartuIstimewa("Dana Umum", "Selamat! Anda memenangkan giveaway dari bank sebesar $10000", 10000));
        kartu.add(new KartuIstimewa("Dana Umum", "Terima bunga dari bank $2500", 2500));
        kartu.add(new KartuIstimewa("Dana Umum", "Dapat sisa uang pajak jalan $5000", 5000));
        kartu.add(new KartuIstimewa("Dana Umum", "Sumbangan untuk korban di Palu $10000", -10000));
        kartu.add(new KartuIstimewa("Dana Umum", "Kembali ke Indonesia", 0));
        ks.add(new KartuIstimewa("Kesempatan", "Maju 3 langkah!", 0));
        ks.add(new KartuIstimewa("Kesempatan", "Jual saham $15000", -15000));
        ks.add(new KartuIstimewa("Kesempatan", "Bayar jasa internet $15000", -15000));
        ks.add(new KartuIstimewa("Kesempatan", "Bayar denda tilang $1500", -1500));
        ks.add(new KartuIstimewa("Kesempatan", "Karena Anda jago monopoli, terimalah $5000", 5000));
        ks.add(new KartuIstimewa("Kesempatan", "Terima cashback $10000", 10000));
        ks.add(new KartuIstimewa("Kesempatan", "Isi bensin $10000", -10000));
        ks.add(new KartuIstimewa("Kesempatan", "Beramal $1000", -1000));
        ks.add(new KartuIstimewa("Kesempatan", "Mundur sampai Jepang", 0));
        ks.add(new KartuIstimewa("Kesempatan", "Masuk Penjara!", 0));
        ks.add(new KartuIstimewa("Kesempatan", "Mundur tiga petak!", 0));
        ks.add(new KartuIstimewa("Kesempatan", "Maju sampai Start!", 0));
}
    
    public void setHargaBeli (int hb) {
        this.hargaBeli = hb;
    }
    
    public int getHargaBeli () {
        return hargaBeli;
    }
    
    public void setHargaJual (int hj) {
        this.hargaJual = hj;
    }
    
    public int getHargaJual () {
        return hargaJual;
    }
    
    public void setNama (String nm) {
        this.nama = nm;
    }
    
    public String getNama () {
        return nama;
    }
    
    public void setPajak (int pjk) {
        this.pajak = pjk;
    }
    
    public int getPajak () {
        return pajak;
    }
}
