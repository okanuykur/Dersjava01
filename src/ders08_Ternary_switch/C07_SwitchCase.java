package ders08_Ternary_switch;

import java.util.Scanner;

public class C07_SwitchCase {

    public static void main(String[] args) {

        // jdk   java devolepment kit
        // kullanicidan bir harf alin
        // alinan harf j d k dan biri ise yukaridaki kelimekeri yazdirin
        // degilse "gecersiz harf" yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir harf girin");

        char harf = scan.next().charAt(0);

        switch (harf){
            case 'J' :
            case 'j' :
                System.out.println("java");
                break;
            case 'D' :
            case 'd' :
                System.out.println("development");
                break;
            case 'k' :
            case 'K' :
                System.out.println("kit");
                break;
            default:
                System.out.println("gecersiz harf");
        }
    }
}
