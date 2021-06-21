package monopoli;
import java.util.Random;
import java.util.Scanner;
public class Pemain {
    Scanner data=new Scanner(System.in);
    String nama;
    String properti[];
    double uang=150000;
    public boolean stat=false;
    public boolean penjara=false;
    Random kck=new Random();
    int posisi=0;
    boolean ulang=false;
//    Papan ppn=new Papan();
    Dadu dd = new Dadu();
    
    Pemain(String nama) {
        this.nama=nama;
    }
    
    Pemain(){}
    
    public void setNama (String nn) {
        this.nama = nn;
    }
    
    public String getNama () {
        return nama;
    }
    
    public void setPosisi (int pss[]) {
//        this.posisi = pss;
    }
    
/*    public int[] getPosisi() {
       return posisi;
    }*/
    
    public void setProperti (String pro[]) {
        this.properti = pro;
    }
    
    public String[] getProperti () {
        return properti; 
    }
        
    
    
    
    public boolean isStat() {
        return stat;
    }

    public void setStat(boolean stat) {
        this.stat = stat;
    }

    public double getUang() {
        return uang;
    }

    public void setUang(double uang) {
        this.uang = uang;
    }
}
