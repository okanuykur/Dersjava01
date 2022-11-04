package ders03_DataCastingWrapperClass;

public class C02_Exil {

    public static void main(String[] args) {


        int sayi =20;


        /* genis data turundki bir degeri
        dar data turundeki bir veriable a atamak isterseniz java sorumlulugu
        almanizi ister

        bu sorumlulugu almak icin
        cast edeceginiz degerin onune () icerisine
        cast etmek istedigimiz data turu yazilir
        ancak bu durumda data kayiplari
        (double den inte gecerken virgulden sonrasi silinir)
         veya baskalasim olabilir ( int i byte cevirirsek tekrar tekrar basa doner)


         */


        short sh= ( short) sayi;
        System.out.println(sh); //20

        double dbl=23.5;

        int say =(int) dbl;

        System.out.println(say); //23


        say= 15; //int

        byte byt= (byte)  say; //15
        System.out.println(byt);










    }
}
