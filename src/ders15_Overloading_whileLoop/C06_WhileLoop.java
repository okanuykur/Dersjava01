package ders15_Overloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

    public static void main(String[] args) {

        /*
        Soru : Kullanicidan bir sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip;
        kullanicinin yeni bir sifre girmesini isteyin
        gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        gecerli bir sifre yazilinca"sifreniz basari ile kaydedildi" yazdirin

        sartlar:
        - sifrenin ilk karakteri harf olmali
        - sifrenin son karakteri sayi olmali

         */

        Scanner scan = new Scanner( System.in);
        boolean sifreGecerliMi= false;
        String sifre = "";


        while (sifreGecerliMi!=true){

            System.out.println("lutfen sifrenizi giriniz");

            sifre= scan.nextLine();
            int bayrak =0;

            if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){

                System.out.println("sifrenizin ilk karakteri kucuk harf olmali");
            }

            if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){

                System.out.println("sifrenin son karakteri sayi olmali");
                bayrak++;
            }

            if (bayrak==0){

                sifreGecerliMi=true;
                System.out.println("sifreniz basari ile kaydedildi");

            }



        }


 }
    }

