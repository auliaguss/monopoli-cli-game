package monopoli;

import java.util.ArrayList;
import java.util.Scanner;
public class KartuIstimewa {
    private String nama;
    private String perintah;
    private boolean kondisi;
    private double komisi;
    private int pindah;
    
    Scanner cc=new Scanner(System.in);
    public KartuIstimewa(String nn, String p, double kk){
        this.nama=nn;
        this.perintah=p;
        this.komisi=kk;
        
    }
    
    public String getNama () {
        return nama;
    }
    
    
    public void getPerintah () {
        System.out.print("Tekan enter untuk membuka kartu!");
        cc.nextLine();
        System.out.println(perintah);
    }
    
    public String perintah(){
        return perintah;
    }
    
    public double getKomisi(){
        return this.komisi;
    }
    
    
//    public String getKondisi () {
//        return kondisi;
//    }
}
