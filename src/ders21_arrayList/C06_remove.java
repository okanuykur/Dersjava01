package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_remove {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 5, 3, 2, 5, 1, 2, 4, 5, 4, 3, 4,};


        // list.set(index,yenideger) methodu
        // istenen indexteki eski degeri bulup bize dondurur
        // yeni deger olarak atar


        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);


        }

        sayilar.remove(2);

        System.out.println(sayilar);
        sayilar.remove(5);
        System.out.println(sayilar);

        /*
        listemiz integerlardan olusuyorsa
        biz inyeger bir deger yazdigimizda
        hep index kabul ettiginden
        istedigimiz elementi obje olarak girip sildirmek icin
        onceden tanimlamak gerekiyor
         */

        Integer silinecekObje = 4;

        sayilar.remove(silinecekObje);
        System.out.println(sayilar);
        // butun 3 leri silelim
        silinecekObje = 3;

        while (sayilar.contains(silinecekObje)) {

            sayilar.remove(silinecekObje);


        }

        System.out.println(sayilar);



    }
}