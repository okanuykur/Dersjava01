package ders22_arrayLists;

import java.util.Arrays;
import java.util.List;

public class C03_ArrayList {

    public static void main(String[] args) {


        Integer[] arr = {1,2,3};

        // verolen bir arayi liste cevirmek icin
        // bir list olusturup for loop ile elementleri tasimayi tavsiye ediyoruz

        List<Integer> arraydenList= Arrays.asList(arr);


        System.out.println(arraydenList); //[1, 2, 3]

       // arraydenList.add(10);// UnsupportedOperationException

        //arraydenList.remove(1);//UnsupportedOperationException

        System.out.println("Array : " + Arrays.toString(arr)); //[1, 2, 3]
        System.out.println("liste : " + arraydenList); //[1, 2, 3]

        arr[0]=10;

        System.out.println("arrayi degistirince array : " + Arrays.toString(arr));
        System.out.println("arrayi degistirince liste : " + arraydenList);
    }
}
