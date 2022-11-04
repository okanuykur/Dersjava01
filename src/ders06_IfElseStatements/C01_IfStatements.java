package ders06_IfElseStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        /*
        If Statements Java’da kod yazarken mutlaka ihtiyac duyacagimiz temel kod
        bloklarindan biridir.
         Gunluk dilimizde oldugu gibi, bir sart ve ona bagli bir sonucu ifade eder.
         */


        // soru : kullanicidan bir harf alin ' harf ile baslayan bir harf varsa
        // kullanici o veya O yazdiginda output Ocak olsun


        Scanner scan = new Scanner(System.in);

        System.out.println(" Lutfen ay isminin ilk harfini giriniz");

        char ilkHarf = scan.next().charAt(0);

        if (ilkHarf=='o' || ilkHarf=='O') {
            System.out.println(" Ocak");
        }

        if (ilkHarf=='s' || ilkHarf=='S') {
            System.out.println(" Subat");
        }

        if (ilkHarf=='m' || ilkHarf=='M') {
            System.out.println(" Mart veya Mayis");
        }

        if (ilkHarf=='n' || ilkHarf=='N') {
            System.out.println("Nisan");
        }

        if (ilkHarf=='h' || ilkHarf== 'H') {
            System.out.println("Haziran");
        }

        if (ilkHarf=='t' || ilkHarf=='T') {
            System.out.println("Temmuz");
        }

        if (ilkHarf=='a' || ilkHarf=='A') {
            System.out.println("Agustos veya Aralik");
        }

        if (ilkHarf=='e' || ilkHarf=='E') {
            System.out.println("Eylul veya Ekim");
        }


        if (ilkHarf=='k' || ilkHarf=='K') {
            System.out.println("Kasim");
        }















    }
}
