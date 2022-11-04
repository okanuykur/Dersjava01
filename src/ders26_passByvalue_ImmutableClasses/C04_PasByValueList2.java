package ders26_passByvalue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_PasByValueList2 {

    public static void main(String[] args) {
         // bir method olusturalim
        // methodda yeni bir liste olusturun
        // listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin
        // sonra sayilar listesine deger olarak yeni listi atayin
        // ve sayilar litini yazdirin

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        yeniListDegeriAta(sayilar);

        System.out.println("method callden sonra main methodda sayilar : " + sayilar);
    }

    public static void yeniListDegeriAta(   List<Integer> sayilar ){


        List<Integer> yeniList = new ArrayList<>();


        for (int i = 0; i <sayilar.size() ; i++) {
            yeniList.add(sayilar.get(i)+5);
        }

        sayilar=yeniList;

        System.out.println("methodda sayilar listesinin son hali : " + sayilar);
    }
}
