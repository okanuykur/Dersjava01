package salonPratik;

import java.util.Scanner;

public class methd_olstrma {

    public static void main(String[] args) {

        isteToplaYzdir();
        isteToplaYzdir();
    }

    public static void  isteToplaYzdir (){

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen iki double sayi giriniz");



        double rakam1= scan.nextDouble();
        double rakam2= scan.nextDouble();

        System.out.println("iki sayinin toplami : " + (rakam1+rakam2));
    }
}
