package ders03_DataCastingWrapperClass;

public class C05_WapperClass {

    public static void main(String[] args) {


        int sayi=10;

        String str ="Java cok guzeldir";
        /*
        primitive data turleri sadece deger barindirirlar
        hazir metodlari yiktur

        java ya yapilan talepler sonucunda
        java primitivr data turleri ile bazi hazir methodlarin kullanilabilmesi icin
        Wrapper class lar olusturmustur


         */

        char krk= 'b';

        Character krkWrapper= 'c';

        System.out.println(Character.isLetter( '5')); // false

        System.out.println(Character.isDigit('7')); // true








    }
}
