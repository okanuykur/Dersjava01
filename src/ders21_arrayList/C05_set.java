package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_set {

    public static void main(String[] args) {

        int[] arr= {1,2,4,3,5,3,2,5,1,2,4,5,4,3,4,};


         // list.set(index,yenideger) methodu
        // istenen indexteki eski degeri bulup bize dondurur
        // yeni deger olarak atar


        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

                sayilar.add(arr[i]);


            }

        // java da set() u uptade icin kullaniriz
        // add() ile set() farklidir


        sayilar.set(0,8);
         sayilar.set(1,9);
        System.out.println(sayilar); //[8, 2, 4, 3, 5, 3, 2, 5, 1, 2, 4, 5, 4, 3, 4]

        }



    }

