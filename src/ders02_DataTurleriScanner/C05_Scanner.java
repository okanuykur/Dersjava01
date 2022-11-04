package ders02_DataTurleriScanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {


        // SORU-2 Kullanicidan bir double , bir de int sayi alip
        // bunlarin toplamini ve carpimini yazin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen kullanicidan bir ondalikli sayi aliniz");

        double ondalikliSayi = scan.nextDouble();

        System.out.println("Lutfen kullanicidan bir tamsayi aliniz");
        int tamSayi = scan.nextInt();

        System.out.println("Girilen sayilarin toplami :" + (ondalikliSayi + tamSayi));
        System.out.println("Girilen sayilarin carpimi : "+ (ondalikliSayi * tamSayi));



    }
}
