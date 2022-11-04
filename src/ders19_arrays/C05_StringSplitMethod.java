package ders19_arrays;

import java.util.Arrays;

public class C05_StringSplitMethod {

    public static void main(String[] args) {

        String str= "java gercekten cok cok guzel";

        // verilen stringde kac tane e harfi oldugunu bulun

        String[] eArrayi=str.split("e");
        System.out.println(Arrays.toString(eArrayi)); //[, java g, rc, kt, n cok cok guz, l]
        System.out.println(eArrayi.length);

        System.out.println("metindeki e sayisi : " + (eArrayi.length-1));

        // 2. yontem

        //stringi "" hhiclik yaparak karakterlerini ayiralim

        String [] tumKrakterlerArr= str.split("");
        System.out.println(Arrays.toString(tumKrakterlerArr));
        //[j, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , c, o, k,  , g, u, z, e, l]

        int sayac=0;
        // bir loop ile tum karakterleri kontrol edelim

        for (int i = 0; i < tumKrakterlerArr.length ; i++) {
            if (tumKrakterlerArr[i].equals("e")){
                sayac++;
            }
        }

        System.out.println("metindeki e sayisi : " + sayac);
    }
}
