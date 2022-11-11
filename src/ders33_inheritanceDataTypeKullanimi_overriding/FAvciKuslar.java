package ders33_inheritanceDataTypeKullanimi_overriding;

public class FAvciKuslar extends EKuslar{
    public void hareket(){
        System.out.println("avci kuslar ucarlar");
    }
    public void beslenme(){
        System.out.println("avci kuslar et yerler");
    }
    public void pence(){
        System.out.println("avci kuslar pencelidirler");
    }
    public void gaga(){
        System.out.println("avci kuslar sivri gagalidir");
    }

    public static void main(String[] args) {

        FAvciKuslar avci1=new FAvciKuslar();
        // bir obje olusturulurken constroctur ve data turu ayni ise
        // hangi METHODUN gecerli oldugunu bulmak icin
        // o classa gider  varsa kullaniriz
        // yoksa sirasu ile parentlere gider ilk buldugumuzu kullaniriz

        avci1.beslenme();//Avci kuslar
        avci1.gaga();// Avci kuslar
        avci1.pence();//// Avci kuslar
        avci1.hareket();//Avci kuslar
        avci1.cogalma();//Kuslar
        avci1.kanat();//Kuslar
        avci1.omur();//Hayvanlar
        avci1.solunum();//Kuslar

        EKuslar avci2= new FAvciKuslar();
        /*
        bir obje olustururken data turu ile constoctur farkli ise
        hangi methodun gecerli ildugunu bulmak icin

        once data turunun oldugu class ve parentlarina bakarak
        o methodu buluruz
        bulamazsak cte verir

        bulursak hemen calistirmayiz
        calistirmadan once o method override edilmis midir diye kontrol ederiz
        edilmisse override eden methodu calistiririz

         */

        avci2.beslenme();//Avci kuslar
        avci2.gaga();// Avci kuslar
       // avci2.pence();//// CTE
        avci2.hareket();//Avci kuslar
        avci2.cogalma();//Kuslar
        avci2.kanat();//Kuslar
        avci2.omur();//Hayvanlar
        avci2.solunum();//Kuslar

            DHayvanlar avci3=new FAvciKuslar();

        avci3.beslenme();//Avci kuslar
        //avci3.gaga();// CTE
        //avci3.pence();//// CTE
        avci3.hareket();//Avci kuslar
        avci3.cogalma();//Kuslar
       // avci3.kanat();//CTE
        avci3.omur();//Hayvanlar
        avci3.solunum();//Kuslar

        EKuslar kus1= new EKuslar();

        kus1.cogalma();//kuslar
        kus1.gaga();//kuslar
        kus1.kanat();//kuslar
        kus1.hareket();//hayvanlar
        kus1.solunum();//kuslar
        kus1.beslenme();//hayvanlar
        kus1.omur();//hayvanlar

        /*
        methodlarla belirlenen ozellikler
        en guncel bilgiyi bulurken

        variable ile belirlenen ozellikler
        ilk buldugu degeri kullanir

        bunun icin methodlara dinamik
        variablelere static ozellik denir
         */

        DHayvanlar kus2= new EKuslar();

        kus2.cogalma();//kuslar
       // kus2.gaga();//CTE
       // kus2.kanat();//CTE
        kus2.hareket();//hayvanlar
        kus2.solunum();//kuslar
        kus2.beslenme();//hayvanlar
        kus2.omur();//hayvanlar

    }
}
