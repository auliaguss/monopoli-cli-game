package monopoli;
import java.util.ArrayList;
import java.util.List;

public class Papan {
    private String jenis;
    private String transaksi;
    public ArrayList<Petak> listPetak = new ArrayList<>();
    
    public Papan(){
        //harga sewa 
        //nama, kompleks, pajakInjak, hargaSewa, hipotik, hotel, rumah
        this.listPetak.add( new Petak("Start", ' ', 0, 0, 0, 0, 0));
        this.listPetak.add( new Petak("Indonesia", 'A', 0, 6000, 3000, 25000, 5000));
        this.listPetak.add( new Petak("Dana Umum", ' ', 0, 0, 0, 0, 0));
        this.listPetak.add( new Petak("Malaysia", 'A', 0, 6000, 3000, 25000, 5000));
        this.listPetak.add( new Petak("Pajak Jalan", ' ', 20000, 0, 0, 0, 0));
        this.listPetak.add( new Petak("Changi Airport", ' ', 0, 20000, 10000, 0, 0));
        this.listPetak.add( new Petak("Singapura", 'B', 0, 10000, 5000, 25000, 5000));
        this.listPetak.add( new Petak("Kesempatan", ' ', 0, 0, 0, 0, 0));
        this.listPetak.add( new Petak("Hongkong", 'B', 0, 10000, 5000, 25000, 5000));
        this.listPetak.add( new Petak("Taiwan", 'B', 0, 12000, 6000, 25000, 5000));
        this.listPetak.add( new Petak("Penjara Hanya Lewat", ' ', 0, 0, 0, 0, 0));
        this.listPetak.add( new Petak("Philiphina", 'C', 0, 14000, 7000, 50000, 10000));
        this.listPetak.add( new Petak("Perusahaan Listrik", ' ', 0, 15000, 0, 0, 0));
        this.listPetak.add( new Petak("Vietnam", 'C', 0, 14000, 7000, 50000, 10000));
        this.listPetak.add( new Petak("Thailand", 'C', 0, 16000, 8000, 50000, 10000));
        this.listPetak.add( new Petak("Terminal Tokyo", ' ', 0, 12000, 10000, 0, 0));
        this.listPetak.add( new Petak("Jepang", 'D', 0, 18000, 9000, 50000, 10000));
        this.listPetak.add( new Petak("Dana Umum", ' ', 0, 0, 0, 0, 0));
        this.listPetak.add( new Petak("Korea", 'D', 0, 18000, 10000, 50000, 10000));
        this.listPetak.add( new Petak("China", 'D', 0, 20000, 9000, 50000, 10000));
        this.listPetak.add( new Petak("Parkir Bebas", ' ', 0, 0, 0, 0, 0));
        this.listPetak.add( new Petak("Swedia", 'E', 0, 22000, 11000, 75000, 15000));
        this.listPetak.add( new Petak("Kesempatan", ' ', 0, 0, 0, 0, 0));
        this.listPetak.add( new Petak("Italia", 'E', 0, 22000, 11000, 75000, 15000));
        this.listPetak.add( new Petak("Jerman", 'E', 0, 22000, 12000, 75000, 15000));
        this.listPetak.add( new Petak("Stasiun London", ' ', 0, 20000, 10000, 0, 0));
        this.listPetak.add( new Petak("Belanda", 'F', 0, 26000, 13000, 75000, 15000));
        this.listPetak.add( new Petak("Inggris", 'F', 0, 26000, 13000, 75000, 15000));
        this.listPetak.add( new Petak("Perusahaan Air", ' ', 0, 15000, 0, 0, 0));
        this.listPetak.add( new Petak("Perancis", 'F', 0, 28000, 14000, 75000, 15000));
        this.listPetak.add( new Petak("Masuk Penjara", ' ', 0, 0, 0, 0, 0));
        this.listPetak.add( new Petak("Canada", 'G', 0, 30000, 15000, 100000, 20000));
        this.listPetak.add( new Petak("Amerika Serikat", 'F', 0, 30000, 16000, 100000, 20000));
        this.listPetak.add( new Petak("Dana Umum", ' ', 0, 0, 0, 0, 0));
        this.listPetak.add( new Petak("Mexico", 'G', 0, 32000, 15000, 100000, 20000));
        this.listPetak.add( new Petak("Pelabuhan Sydney", ' ', 0, 20000, 10000, 0, 0));
        this.listPetak.add( new Petak("Kesempatan", ' ', 0, 0, 0, 0, 0));
        this.listPetak.add( new Petak("Australia", 'F', 0, 35000, 17000, 100000, 20000));
        this.listPetak.add( new Petak("Pajak Istimewa", ' ', 0, 10000, 0, 0, 0));
        this.listPetak.add( new Petak("Afrika", 'F', 0, 40000, 20000, 100000, 20000));
    }
    
    public void setJenis(String sj){
        this.jenis=sj;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public void setTransaksi(String st){
        this.transaksi=st;
    }
    
    public String getTransaksi(){
        return transaksi;
    }
    
    public static void setupListPetak() {
//        this.listPetak.add(new Petak("Indonesia", 'A', 6000, ));
    }

    public ArrayList<Petak> getListPetak() {
        return listPetak;
    }

}
