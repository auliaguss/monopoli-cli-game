package monopoli;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Monopoli {
    public static void main(String[] args) {
        
        Scanner data=new Scanner(System.in);
        System.out.print("Masukkan jumlah pemain: ");
        int jumlah=data.nextInt();
        String statusGame = "on";
        String[] namaPemain=new String[jumlah];
        ArrayList<Pemain> pp= new ArrayList<>();
        ArrayList<tampilanMonopoli> display=new ArrayList<>();
        display.add(new tampilanMonopoli());
        for(int i=0; i<jumlah; i++){
            System.out.print("Masukkan nama pemain ke "+(i+1)+" : ");
            namaPemain[i]=data.next();
            pp.add( new Pemain(namaPemain[i]) ); 
        }
        while( statusGame.equals("on") ) {
            for(int i=0; i<jumlah; i++){
                display.get(0).kocok(pp.get(i));
                if(pp.get(i).getUang()<0.0){
                    System.out.println("Uang "+pp.get(i).getNama()+" telah habis.\n==========Permainan selesai!==========");
                    statusGame="off";
                    continue;
                }
            }
        }
        System.out.println("");
        
        for(int i=0; i<jumlah; i++) {
            System.out.println((i+1)+". "+pp.get(i).getNama()+" == "+pp.get(i).getUang());
        }
//        double[] peringkat=new double[jumlah];
//        for(int i=0; i<jumlah; i++) {
//            peringkat[i]=pp.get(i).getUang();
//        }
//        Arrays.sort(peringkat);
//        for(int i=0; i<jumlah; i++) {
//            System.out.println((i+1)+". "+pp.indexOf(i));}
        
        
    }   
}