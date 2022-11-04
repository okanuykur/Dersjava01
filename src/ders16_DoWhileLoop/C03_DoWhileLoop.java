package ders16_DoWhileLoop;

import java.util.Scanner;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        // Ornek : input : 16, output: 4

        int input = 44;
        int baslangic=1;
        int bayrak= 0;

        do {
            if (baslangic*baslangic==input){

                System.out.println("true");

                break;
            }
            baslangic++;

        }while (baslangic*baslangic<=input);

        if (bayrak==0){
            System.out.println("false");
        }

    }
}
