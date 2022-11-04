package ders06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {

    public static void main(String[] args) {

        // kullanicidan yasini isteyin, 65 yas ve uzeri ise "Emekli olabilirsin' yazdirin,
        // degilse emekli olabilmesi icin calismasi gereken yili yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi girin");

        double yas = scan.nextDouble();

        if (yas>=65) {
            System.out.println("Yasiniz emeklilik icin yeterli");
        } else {
            System.out.println(" Emekli olabilmek icin " + (65-yas) + " sene daha calismalisin"); }
    }
}
