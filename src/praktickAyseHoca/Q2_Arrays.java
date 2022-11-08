package praktickAyseHoca;

import java.util.Arrays;

public class Q2_Arrays {
    public static void main(String[] args) {
        int [] integers;
        integers = new int[5];

        System.out.println(Arrays.toString(integers));
        integers [0]=1;

        integers [1]=2;

        integers [2]=3;

        integers [3]=4;

        integers [4]=5;

        System.out.println(Arrays.toString(integers));

        char[] charlar = new  char[3];

        charlar[0] ='A';
        charlar[1]='B';
        charlar[2]='C';

        String charlarString = Arrays.toString(charlar);

        System.out.println(charlarString);

        String [] isimler = new  String[3];


        isimler[0]="ayse";
        isimler[1]="fatma";
        isimler[2]="hayriye";

        String isimlerString = Arrays.toString(isimler);


        // soru= ayse ile fatmanin yerini degistrin

         String bosKova = isimler[0];
         isimler[0]= isimler[1];
         isimler[1]= bosKova;

        System.out.println("yeni hali : " + Arrays.toString(isimler));










    }


}
