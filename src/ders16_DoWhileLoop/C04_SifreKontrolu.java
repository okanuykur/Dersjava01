package ders16_DoWhileLoop;

import java.util.Scanner;

public class C04_SifreKontrolu {

    public static void main(String[] args) {
        /*
        Soru - kullanicidan bir sifre girmesini isteyin
        girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin
        kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
        ve gecerli sifre girdiginde "Sifreniz kabul edilmistir" yazdirin
        - sifre kucuk harf icermelidir
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter olmalidir
         */

        Scanner scan = new Scanner(System.in);

        String sifre;
        int bayrak;
        boolean sifreDogruMu;

        do {
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();
            // tum hatalari soylemesini istiyorsak
            // bagimsiz if cumleleri ve bayrak kullanmak zorundayiz
            bayrak = 0;
            int sonuc = kucukHarfKontroluYap(sifre);

            // kucuk harf kontrolu yapan bir method olusturalim
            // kucukl harf varsa 1 , yoksa 0 dondursun
            bayrak=bayrak+sonuc;

            // sifre buyuk harf icermelidir

            sonuc= buyukHarfkOontroluYap(sifre);

            // buyuk harf kontrolu yapan bir method olusturalim
            // buyuk harf varsa 1 , yoksa 0 dondursun

            bayrak=bayrak+sonuc;

            // - Sifre ozel karakter icermelidir

            sonuc= ozelKarakterKontroluYap(sifre);


            bayrak=bayrak+sonuc;

           //  - Sifre en az 8 karakter olmalidir

            if (sifre.length()<8){

                System.out.println("sifre en az 8 karakter olmalidir");
            }else {
                bayrak++;
            }

            // bayrak 4 ise sifre tamadir, degilse hata vardir
        }while (bayrak !=4);

        System.out.println("sifreniz basari ile kaydedildi");
    }

    public static int ozelKarakterKontroluYap(String sifre) {

        int bayrak=0;

        String ozelKarakterler= "!@#$%^&*()_+-=<,>.?/:;";

        // sifre buyuk ozel karakterler icermelidir
        // bunun icin tum harfleri kontol edecek bir for loop olusturmaliyim
        // eger sifrenin karakterlerinden bir tanesinin ozelKarakterler stringi iceriorsa
        // bizim icin yeterli olur

        for (int i = 0; i <sifre.length() ; i++) {

            if (ozelKarakterler.contains(sifre.substring(i,i+1))){

                bayrak++;
                break;


            }
            
        }
             // bayrak== 0 ise ozel karakter yoktur
        if (bayrak==0){

            System.out.println("Sifre ozel karakter icermelidir");
            return 0;

        }else return 1;



    }

    public static int buyukHarfkOontroluYap(String sifre) {

        int bayrak = 0;

        // sifre buyuk harf icermelidir
        // bunun icin tum harfleri kontol edecek bir for loop olusturmaliyim
        // 1 tane buyuk harf bulmam yeterli olacak

        for (int i = 0; i < sifre.length(); i++) {

            if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') ;

            bayrak++;
            break;
        }


        // bayrak==0 ise  buyuk harf yoktur, yani bir hata vardir bunu yazdiralim
        if (bayrak==0){

            System.out.println("Sifre buyuk harf icermelidir");
            return 0;

        }else return 1;




    }

    public static int kucukHarfKontroluYap(String sifre) {

        int bayrak = 0;

        // sifre kucuk harf icermelidir
        // bunun icin tum harfleri kontol edecek bir for loop olusturmaliyim
        // 1 tane kucuk harf bulmam yeterli olacak

        for (int i = 0; i < sifre.length(); i++) {

            if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') ;

            bayrak++;
            break;
        }


        // bayrak==0 ise kucuk harf yoktur, yani bir hata vardir bunu yazdiralim
         if (bayrak==0){

             System.out.println("Sifre kucuk harf icermelidir");
             return 0;

         }else return 1;

    }

}

