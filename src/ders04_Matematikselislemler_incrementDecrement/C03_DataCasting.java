package ders04_Matematikselislemler_incrementDecrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {


        // kullanicidan iki int deger alip
        // bunlari birbirine bolun ve sonucu double olarak yazdirin

         Scanner scan = new Scanner(System.in);

        System.out.println(" Lutfen iki tamsayi giriniz");

        int sayi1 = scan.nextInt(); // 20
        int sayi2 = scan.nextInt(); // 6
        System.out.println(sayi1/sayi2); // 3

        double ondalikliSonuc= (double) (sayi1/sayi2);
        System.out.println(ondalikliSonuc);
        double dogruSonuc = (double) sayi1/sayi2 ; // double / int = genis olana gore sonuc verir
        System.out.println(dogruSonuc); // 3.333333335





    }
}
