package salonPratik;

import java.util.ArrayList;
import java.util.List;

public class list_0 {

    public static void main(String[] args) {


        int [] arr = {1,2,3,1,2,3,4,5,6,4,5,6,7,9,0,7,9,0};

        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            sayilar.add(arr[i]);
        }

        sayilar.remove(6);
        System.out.println(sayilar);

        Integer silinecekobje = 1;

        sayilar.remove(silinecekobje);

        System.out.println(sayilar);
        silinecekobje=3;

        while (sayilar.contains(silinecekobje)){

            sayilar.remove(silinecekobje);

        }

        System.out.println(sayilar);

        sayilar.remove(20);

        }

    }

