package ders08_Ternary_switch;

import java.util.Scanner;

public class C01_Ternary {

    public static void main(String[] args) {

        //Ternary, if-else statements ile yapabilecegimiz basit islemleri, daha basit bir formda
       // kodlama imkani verir.

        // kullanicidan bir sayi alin
        // sayi pozitif ise 2 katini yazdirin
        // sayi pozitif degilse sayiya 10 ekleyip yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi girin");

        double sayi = scan.nextDouble();

        System.out.println(sayi >0 ? 5*sayi : sayi+5 ); // bu islem tearny ile basit bir islem





    }
}
