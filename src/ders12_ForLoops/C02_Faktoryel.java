package ders12_ForLoops;

public class C02_Faktoryel {

    public static void main(String[] args) {

        // kullanicinin verdigi sayinin faktoryelini bulalim

        // 5 ! = 5*4*3*2*1 = 120 // faktoryel icin sagdan sola dogru carparak gelmek

         int sayi = 10;

         int faktoryel = 1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel=faktoryel*i;

        }

        System.out.println(faktoryel);

          // 1 den 100 e kadar olan sayilari toplayin sinirlar dahil

        int toplam=0;

        for (int i = 1; i <=100 ; i++) {

            toplam=toplam+i;

        }

        System.out.println(toplam);



 }
    }

