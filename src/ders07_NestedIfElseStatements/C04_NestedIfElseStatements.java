package ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseStatements {

    public static void main(String[] args) {

        // kullanicidan cinsiyetini ve yasini alin. Kadin 60 yas ve uzeri
        // Erkek 65 yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak
        // "Emekli olabilirsin" ya da "Emekli olmak icin   Yil daha calisman gerekir" yazdirin
        // ana degisken yas olsun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        System.out.println("Lutfen cinsiyeti giriniz");
        char cinsiyet = scan.next().charAt(0);

        if (yas<15){
            System.out.println("hatali yas girisi");

        } else if (yas<60) {
            // emekli olamaz calismasi gereken sure cinsiyete bagli
            System.out.println("emekli olamazsin");

            if (cinsiyet=='k' || cinsiyet== 'K'){
                System.out.println("emekli olamazsin daha " + (60-yas) + " yil calisman lazim" );


            } else if (cinsiyet=='e' || cinsiyet == 'E') {
                System.out.println("emekli olamazsin daha " + (65-yas) + " yil calisman lazim" );


            } else {
                System.out.println("hatali  cinsiyet giris");
            }


        } else if (yas<65) {
            // kadin ise emekli olabilir, erkek ise calismasi lazim
            if (cinsiyet== 'k' || cinsiyet== 'K'){
                System.out.println("emekli olabilirsin");

            } else if (cinsiyet=='e' || cinsiyet=='E') {
                System.out.println("emekli olamazsin daha " + (65-yas) + " yil calisman lazim" );

            } else {

                System.out.println("hatali  cinsiyet giris");
            }


        } else {
            // bu demek artik yas 65 den buyuktur ve emekli olabilir

            System.out.println("emekli olabilirsin");
        }


    }
}
