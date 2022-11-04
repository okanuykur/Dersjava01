package ders13_NestedForLoop_MethodOlusturma;

public class C03_NestedForLoop {

    public static void main(String[] args) {

       /*
       For Loop, belirli sayıda çalıştırılması gereken bir döngüyü verimli bir şekilde
yazmanıza olanak tanıyan bir tekrar kontrol yapısıdır.
Bazen verilen gorevi yapmak icin tek bir loop yeterli olmaz, Ornegin bir carpim
tablosu hazirlamak veya bir futbol liginde oynanacak maclari planlamak icin tek bir
loop yeterli olmaz . Bu durumda nested for loop u kullanabiliriz.
        */
        /*
        soru; 1 ile 4 arasindaki sayilar icin carpim tablosu olusturalim
         */

        // dis satirlari kontrol eder

        for (int i =1 ; i <=4 ; i++) {

            // ic dongu her satirda olan donguleri kontrol eder

            for (int j = 1; j <= 4; j++) {

                System.out.print(i*j + " ");

            }

            // ic dongu bitiginde java yi alt satira indirmeliyiz

            System.out.println("");
        }





    }
}
