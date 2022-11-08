package praktickAyseHoca;

import java.util.Arrays;

public class Q3_Arrays {

    public static void main(String[] args) {
        // create an array of 5 floats and calculate their sum

        float[] sayilar = {1.0f,2.0f,3.0f,4.0f,5.0f};

        float toplam=0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];

        }

        System.out.println(toplam);

        System.out.println("****************WHILE COZUMU******************");

         toplam=0;
         int index= sayilar.length -1;
         while (index>=0){

             toplam+=sayilar[index];
          index--;
         }
        System.out.println(toplam);

        System.out.println("*******do while cozumu ************");

        toplam=0;
        index=0;

        do {
            toplam+=sayilar[index];
            index++;
        }while (index<sayilar.length);

        System.out.println(toplam);


    }

}
