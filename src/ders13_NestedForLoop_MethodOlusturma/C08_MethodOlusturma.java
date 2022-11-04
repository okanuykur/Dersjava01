package ders13_NestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C08_MethodOlusturma {

    public static void main(String[] args) {


         /*
        Kullanicidan 2 sayi alip bunlarin toplamini yazdiran bir method olusturun
         */

       istetoplaYazdir();
       istetoplaYazdir();


    }

    public  static void  istetoplaYazdir(){

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println("girilen sayilarin toplami : " + (sayi1+sayi2));
    }


}
