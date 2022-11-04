package ders03_DataCastingWrapperClass;

public class C01_DataCasting {
    public static void main(String[] args) {

        /*
        bazi data turleri asla birbirine cast edilemez

        or=
        String str= 20;
        booelean mutluMu = "true";
        int a= true;
         */

        double s = 20;

        int sayi = 15;

        long ln = sayi ; // estiligin sol tarafi ling , sag tarafi yani deger ise int
        // ama java itiraz etmedi


        /*
         dar data turunden bi degeri , genis bir data turundeki variablea ya atama yaparsaniz
          java bunu otomatik olarak yapar
          ornagin;
         */
        short sh = 23;
        int a= sh;
        long lng = sh;
        float fl = lng;

        /*
        ama tersini yapmak isterseniz yani buyuk data turundeki bir degeri
        kucuk data turundeki bir vaeiablea ya atamak isterseniz data bunu kabul etmez
        ornegin:

        double dbl = 20;

        a = dbl ;

        short abc = dbl;

         */













    }
}
