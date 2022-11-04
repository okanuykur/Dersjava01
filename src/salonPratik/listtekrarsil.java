package salonPratik;

import java.util.ArrayList;
import java.util.List;

public class listtekrarsil {

    public static void main(String[] args) {


        int [] arr = {1,2,3,1,2,3,4,5,6,4,5,6,7,9,0,7,9,0};

        List <Integer> sayilar= new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            sayilar.add(arr[i]);
        }

       sayilar.set(0,8);

        System.out.println(sayilar);

        sayilar.set(6,90);

        System.out.println(sayilar);
    }
}
