package monopoli;

import java.util.Random;

public class Dadu {
    private int nilai1;
    private int nilai2;
    private int total;
    
    Random kocok = new Random ();
    
    public void setDadu1(){
        nilai1 = 1 + kocok.nextInt(6);
//        nilai1=4;
        
    }
    public int getDadu1() {
        return nilai1;
    }
    
    public void setDadu2 () {
        nilai2 = 1 + kocok.nextInt(6);
//        nilai2=3;
    }
    
    public int getDadu2 () {
        return nilai2;
    }
    
    public void setTotal () {
        total = nilai1 + nilai2;
    }
    
    public int getTotal () {
        return total;
    }
}
