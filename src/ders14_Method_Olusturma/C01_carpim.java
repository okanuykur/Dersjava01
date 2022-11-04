package ders14_Method_Olusturma;

import java.util.Scanner;

public class C01_carpim {

    // main method icerisinde kullanicidan iki sayi alin
    // bu iki sayiyi parametre olarak kabul edip
    // carpimlarini bize donduren bir method olusturun

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen iki sayi girin");

        double sayi1 = scan.nextDouble(); //5
        double sayi2 = scan.nextDouble();  // 3

        System.out.println(carpimMethodu(sayi1, sayi2)); // 15

        double carpimSonucu= carpimMethodu(7,8); // calisti ama sonucu vermedi


    }

       public  static double carpimMethodu (double sayi1, double sayi2){
           System.out.println("carpim methodu calisti");
        return sayi1*sayi2 ;

       }













}
