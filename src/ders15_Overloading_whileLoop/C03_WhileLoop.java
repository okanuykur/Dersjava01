package ders15_Overloading_whileLoop;

public class C03_WhileLoop {

    public static void main(String[] args) {

         /*
       For Loop, belirli sayıda çalıştırılması gereken bir döngüyü verimli bir şekilde
        yazmanıza olanak tanıyan bir tekrar kontrol yapısıdır.
         For loop kullanirken ihtiyacimiz olan
       - baslangic degeri,
       - bitis sarti (condition)
       - artis/azalis yontemi
       bilgilerine while loop icin de ihtiyac duyariz,
       ama java bunlari otomatik yazmadigi icin manuel olarak yazmamiz gerekir

         */
         // 2 basamakli sayilari aralarinda bir bosluk olacak sekilde yanyana yazdiralim

        for (int i = 10; i <100 ; i++) {

            System.out.print(i+ " ");

        }
        System.out.println("");


        // while loop ile yaparsak

         int a = 10; // once deger atamaliyiz

        while (a<100){

            System.out.print(a + " ");

            a++;
        }

    }
}
