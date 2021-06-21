package monopoli;
import java.util.Random;
import java.util.Scanner;

public class tampilanMonopoli{
    Scanner data=new Scanner(System.in);
    Papan ppn=new Papan();
    Dadu dd = new Dadu();
    Random kck=new Random();
    
    public void kocok(Pemain player){
        if(player.penjara==true){
            System.out.println(player.nama+" masih berada di PENJARA! Dapatkan angka dadu yang sama untuk keluar!");
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+player.nama+", tekan ENTER untuk mengocok dadu!");
            data.nextLine();
            dd.setDadu1();
            dd.setDadu2();
            dd.setTotal();
            System.out.print("Nilai dadu 1 = " +dd.getDadu1());
            System.out.println("\tNilai dadu 2 = " +dd.getDadu2());
            if(dd.getDadu1()==dd.getDadu2()){
                System.out.println("Anda berhasil keluar dari penjara! Silakan lanjut bermain!");
                player.penjara=false;
            }
            else{
                System.out.println("Maaf, anda kurang beruntung! Anda masih berada dalam penjara");
            }
        }
        else{
        do {
        int sama = 0;
            if (sama == 3) {
            if(player.stat=false){
                continue;
            }
            else{
                masukPenjara(player);
            }
        }
        dd.setDadu1();
        dd.setDadu2();
        dd.setTotal();
        player.posisi+=dd.getTotal();
        if(player.posisi==10){
            //maksudnya nomor 10 itu 'petak penjara hanya lewat'
            player.posisi+=1;
        }
        //kalau posisi nya sudah lebih atau sama dengan 39 yang berarti petak monopoli sudah sampai akhir maka akan kembali lagi ke awal
        if (player.posisi >= 39) {
            player.stat=true;
            player.ulang=true;
            player.posisi -= 39;
        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+player.nama+", tekan ENTER untuk mengocok dadu!");
        data.nextLine();
        System.out.print("Nilai dadu 1 = " +dd.getDadu1());
        System.out.println("\tNilai dadu 2 = " +dd.getDadu2());
        System.out.println("Total nilai pada dadu = " +dd.getTotal());
        System.out.println("Sekarang Anda berada di "+ppn.listPetak.get(player.posisi).getNamaTempat());
        if(player.ulang==true){
            player.setUang(player.getUang() + 20000);
            System.out.println("Anda telah melalui start!");
            player.ulang=false;
        }
        
        if(player.stat==true){
            operasi(player);
        }
        sama+=1;
        if(dd.getDadu1() == dd.getDadu2()){
            System.out.println("!!!Anda Mendapat Angka Dadu Yang Sama!!!");
        }
        }
        while (dd.getDadu1() == dd.getDadu2());}
    }
    Kartu krt=new Kartu();
    public void operasi(Pemain player){
        String namaTempat=ppn.listPetak.get(player.posisi).getNamaTempat();
        double pajakInjak=ppn.listPetak.get(player.posisi).getPajakInjak();


        if(namaTempat.toLowerCase().contains("pajak")){
            System.out.println("Anda menginjak pajak!");
            System.out.println("Uang anda dikurangi sebesar 20000$!");
            player.uang-=pajakInjak;
        }
        else if(namaTempat.toLowerCase().contains("start")){
        
        }
        
        else if(namaTempat.toLowerCase().contains("dana umum")){
            int n=kck.nextInt(16);
            krt.kartu.get(n).getPerintah();
            if(krt.kartu.get(n).perintah().contains("penjara")){
                masukPenjara(player);
            }
            else{
            player.uang+=krt.kartu.get(n).getKomisi();
            }
        }
        else if(namaTempat.toLowerCase().contains("kesempatan")){
            int n=kck.nextInt(12);
            krt.ks.get(n).getPerintah();
            if(krt.ks.get(n).perintah().toLowerCase().contains("penjara")){
                masukPenjara(player);
            }
            else{
            player.uang+=krt.ks.get(n).getKomisi();
            }
        }
        
        else if(namaTempat.toLowerCase().contains("masuk penjara")){
            masukPenjara(player);
        }
        else if(namaTempat.toLowerCase().contains("parkir")){
            System.out.print("Anda mau parkir dimana?");
            String parkir=data.next();
            int index = 0;
            for (int i = 0; i < ppn.getListPetak().size(); i++) {
                if (ppn.getListPetak().get(i).getNamaTempat().toLowerCase().contains(parkir.toLowerCase())) {
                    index = i;
                }
            }
            player.posisi=index;
            System.out.println("Kini anda berada di = "+ppn.listPetak.get(player.posisi).getNamaTempat());
            operasi(player);
        }
        else if(ppn.listPetak.get(player.posisi).getPemilik().equals("tidakada")){
            System.out.print("Harganya $"+ppn.listPetak.get(player.posisi).getHargaSewa()+". Ingin membeli tempat ini? [y/t]?");
            String beli=data.next();
            if(beli.toLowerCase().equals("y")){
                beliTempat(player);
            }
        } else {
            if(ppn.listPetak.get(player.posisi).getPemilik().equals(player.nama)){
                if(ppn.listPetak.get(player.posisi).getHargaRumah()==0){
                    
                }
                else if (ppn.listPetak.get(player.posisi).isBangunRumah()==true&&ppn.listPetak.get(player.posisi).isBangunHotel()==false) {
                    if(ppn.listPetak.get(player.posisi).getHargaRumah()==0){
                        
                    }
                    System.out.print("Apakah Anda mau membangun rumah [y/t] ? Harganya $"+ppn.listPetak.get(player.posisi).getHargaRumah() +" " );
                    String jawaban = data.next();
                    if (jawaban.toLowerCase().equals("y")) {
                        BeliRumah(player);
                    }
                }
                else if (ppn.listPetak.get(player.posisi).isBangunHotel()==true) {
                    System.out.print("Apakah Anda ingin membangun hotel [y/t] ? Harganya $"+ppn.listPetak.get(player.posisi).getHargaHotel() +" " );
                    String jawaban = data.next();
                    if (jawaban.toLowerCase().equals("y")) {
                        BeliHotel(player);
                    }
                }
            }
            else{
                System.out.println("!!!!ANDA TELAH MENGINJAK KAWASAN MILIK "
                        +ppn.listPetak.get(player.posisi).getPemilik()+"!!!!");
                System.out.println("Dengan ini anda harus membayar sebesar $"
                        +ppn.listPetak.get(player.posisi).getPajakInjak());
                player.uang-=ppn.listPetak.get(player.posisi).getPajakInjak();
            }
        }
            System.out.println("Jumlah uang anda sekarang = "+player.uang);
            data.nextLine();
    
   }
    
    public void beliTempat(Pemain player){
        if(player.uang<ppn.listPetak.get(player.posisi).getHargaSewa()){
            System.out.println("Maaf, uang anda kurang!");
        }
        else{
        System.out.println("Selamat! Anda telah membeli tempat ini");
        krt.printKartuTanah(player.posisi);
        player.uang-=ppn.listPetak.get(player.posisi).getHargaSewa();
        ppn.listPetak.get(player.posisi).setBangunRumah(true);
        ppn.listPetak.get(player.posisi).setPemilik(player.nama);
        ppn.listPetak.get(player.posisi).setPajakInjak();
            System.out.println( ppn.listPetak.get(player.posisi).getNamaTempat() + ppn.listPetak.get(player.posisi).getPemilik() + " ini pemiliknya");
        }
        data.nextLine();
    }
    
    public void BeliRumah(Pemain player) {
        if (player.uang<ppn.listPetak.get(player.posisi).getHargaRumah()) {
            System.out.println("Maaf, uang Anda kurang!");
        }
        else {
            System.out.println("Selamat! Anda telah membangun rumah baru!");
            player.uang-=ppn.listPetak.get(player.posisi).getHargaRumah();
            ppn.listPetak.get(player.posisi).setBangunHotel(true);
            
        ppn.listPetak.get(player.posisi).setPajakInjak();
        }
        data.nextLine();
    }
    
    public void BeliHotel(Pemain player) {
        if (player.uang<ppn.listPetak.get(player.posisi).getHargaHotel()) {
            System.out.println("Maaf, uang Anda kurang!");
        }
        else {
            System.out.println("Selamat! Anda telah membangun hotel!");
            player.uang-=ppn.listPetak.get(player.posisi).getHargaHotel();
            ppn.listPetak.get(player.posisi).setKomplit(true);
            ppn.listPetak.get(player.posisi).setPajakInjak();
        }
        data.nextLine();
    }
    
    public void masukPenjara(Pemain player){
        System.out.println("!!!!!!!!!!!!ANDA MASUK PENJARA!!!!!!!!!!!");
            player.stat=false;
            player.penjara=true;
            System.out.println("Kini anda tidak bisa mengocok dadu lagi :D");
            System.out.print("Ingin keluar dari penjara? Bayar $20000! Tekan [y/n]");
            String jwb=data.next();
            if(jwb.toLowerCase().equals("y")){
                if (player.uang<20000) {
                    System.out.print("Maaf, uang Anda kurang!");
                }
                else {
                    System.out.println("Selamat! Anda berhasil keluar dari penjara!");
                    player.uang-=20000;
                    player.stat=true;
                    player.penjara=false;
                }
            }
            else{
                System.out.println("Selamat menunggu!");
                player.stat=false;
                player.penjara=true;
            }
    }
}
