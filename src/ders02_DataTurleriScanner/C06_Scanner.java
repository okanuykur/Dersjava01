package ders02_DataTurleriScanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {


        // Soru : 4 Kullanicidan bir diktorgenin kenar uzunlugunu alip, diktortgenin alanini yazdiriniz

        Scanner scan = new Scanner(System.in);

        System.out.println(" Lutfeen dikdortgenin iki kenar uzunlugunu giriniz" +
                " iki kenar uzunlugu arasinda enter'a basiniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();

        System.out.println("dikdortgenin alani : " + (kenar1*kenar2));






    }

}
