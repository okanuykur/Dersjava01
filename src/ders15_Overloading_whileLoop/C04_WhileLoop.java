package ders15_Overloading_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

    public static void main(String[] args) {

        // kullanicidan toplanmak uzere tamsayilar alin
        // kullanici 0 ' a basarsa  sayi alma islemini bitirin
        // kullanicinin kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin

        Scanner scan = new Scanner(System.in);

        int girilenSayi = 5; // verilen ilk deger bu soru icin 0 olmamali
                            // cunku 0 loop u bitirmek icin kullanilacak

        int sayac= 0;
        int toplam = 0;

          while (girilenSayi !=0){

              System.out.println("Lutfen toplanmak icin tamsayi girin " +
                      "\nbitirmek icin 0' a basin");

              girilenSayi= scan.nextInt();

              if (girilenSayi !=0){

                  sayac++;
                  toplam=toplam+girilenSayi;
              }

          }

        System.out.println("Girilen " + sayac + "adet sayinin toplami " + toplam);







    }
}
