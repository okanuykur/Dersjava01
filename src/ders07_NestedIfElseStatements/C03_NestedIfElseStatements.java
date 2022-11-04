package ders07_NestedIfElseStatements;

public class C03_NestedIfElseStatements {

    public static void main(String[] args) {

        // kullanicidan cinsiyetini ve yasini alin. Kadin 60 yas ve uzeri
        // Erkek 65 yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak
        // "Emekli olabilirsin" ya da "Emekli olmak icin   Yil daha calisman gerekir" yazdirin
        char cinsiyet = 'e';
        int yas = 12;


        // nested if-else seklinde kullanim icin once ana degiskeni secip
        // ona gore ana yapiyi olusturalim
        // cinsiyet ana degisken olsun

        if (cinsiyet == 'K' || cinsiyet == 'k') {
            // girilen cinsiyet kadina ait

            if (yas<15) {
                System.out.println("hatali yas girisi");

            } else if (yas<60 ) {
                System.out.println(" emekli olamazsin daha " + (60-yas) + " yil calismalisin");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else if (cinsiyet=='E' || cinsiyet=='e') {
            // girilen cinsiyet erkege ait
            if (yas<15) {
                System.out.println("hatali yas girisi");

            } else if (yas<65) {
                System.out.println(" emekli olamazsin daha " + (65-yas) + " yil calismalisin");


            } else {
                System.out.println("emekli olabilirsin");
            }

        } else {
            System.out.println("yanlis cinsiyet girisi");
        }


    }




    }

