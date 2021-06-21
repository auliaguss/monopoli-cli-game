package monopoli;
import java.util.Scanner;
import java.util.ArrayList;

public class Petak {
    private char kompleks;
    private double pajakInjak;
    private double hargaSewa;
    private double hargaHipotik;
    private double hargaRumah;
    private double hargaHotel;
    private String namaTempat;
    private String pemilik="tidakada";
    private boolean bangunRumah=false;
    private boolean bangunHotel=false;
    private boolean komplit=false;
    Scanner data=new Scanner(System.in);
    
    
    public Petak(String nT, char k, int pI, double hS, double hH, double hL, double hR){
        this.namaTempat=nT;
        this.kompleks=k;
        this.pajakInjak=pI;
        this.hargaSewa=hS;
        this.hargaHipotik=hH;
        this.hargaHotel=hL;
        this.hargaRumah=hR;
    }
    
    public char getKompleks() {
        return kompleks;
    }

    public void setKompleks(char kompleks) {
        this.kompleks = kompleks;
    }

    public double getPajakInjak() {
//        if(bangunRumah==true&&bangunHotel==false){
//            this.pajakInjak=13/100*hargaSewa;
//        }
//        else if(bangunHotel==true){
//            this.pajakInjak=30/100*hargaRumah;
//        }
//        
//        else if(komplit==true){
//            this.pajakInjak=50/100*hargaHotel;
//        }
//        else{
//            this.pajakInjak=9;
//        }
        return this.pajakInjak;
    }

    public void setPajakInjak() {
        if(bangunRumah==true&&bangunHotel==false){
            this.pajakInjak=13*hargaSewa/100;
        }
        else if(bangunHotel==true){
            this.pajakInjak=30*hargaRumah/100;
        }
        
        else if(komplit==true){
            this.pajakInjak=50*hargaHotel/100;
        }
        else{
            this.pajakInjak=5;
        }
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public double getHargaHipotik() {
        return hargaHipotik;
    }

    public void setHargaHipotik(double hargaHipotik) {
        this.hargaHipotik = hargaHipotik;
    }

    public double getHargaHotel() {
        return hargaHotel;
    }

    public void setHargaHotel(double hargaHotel) {
        this.hargaHotel = hargaHotel;
    }

    public String getNamaTempat() {
        return namaTempat;
    }

    public void setNamaTempat(String namaTempat) {
        this.namaTempat = namaTempat;
    }

    public double getHargaRumah() {
        return hargaRumah;
    }

    public String getPemilik() {
        return this.pemilik;
    }

    public void setPemilik(String pemilikk) {
        this.pemilik = pemilikk;
    }

    public boolean isBangunRumah() {
        return bangunRumah;
    }

    public void setBangunRumah(boolean bangunRumah) {
        this.bangunRumah = bangunRumah;
    }

    public boolean isBangunHotel() {
        return bangunHotel;
    }

    public void setBangunHotel(boolean bangunHotel) {
        this.bangunHotel = bangunHotel;
    }

    public boolean isKomplit() {
        return komplit;
    }

    public void setKomplit(boolean komplit) {
        this.komplit = komplit;
    }


    
    
    
}
