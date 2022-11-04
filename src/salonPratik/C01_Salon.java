package salonPratik;

import java.util.Scanner;

public class C01_Salon {

    public static void main(String[] args) {


        /*
        // Soru  (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum tamsayilari yazdirin
        // - 3 ile bolunebilen bir sayiya gelirse, sayi yerine "fizz"
        // - 5 ile bolunebilen bir sayiya gelirse sayi yerine "buzz"
        // - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine "fizzBuzz" yazdirin

         */

        int sayi = 65;

        for (int i = 1; i <=65 ; i++) {

            if (sayi%5==0 && sayi%2==0){
                System.out.print("vaav\n");
            } else if (sayi%3==0) {
                System.out.print("yaavv ");

            } else if (sayi%5==0) {
                System.out.print("oovvv ");

            }
            System.out.println(i + " ");
            }

        }


 }


