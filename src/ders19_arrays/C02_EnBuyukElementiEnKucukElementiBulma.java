package ders19_arrays;

import java.util.Arrays;

public class C02_EnBuyukElementiEnKucukElementiBulma {

    public static void main(String[] args) {
        // verilen bir int array de en kucuk ve en buyuk sayilari yazdiran bir method olusturun

        int[] arr={3,8,1,5,2,9,0,20};

        enBuyukEnKucukElementYazdir(arr);


    }

    public static void enBuyukEnKucukElementYazdir(int[] arr){

        Arrays.sort(arr); // Arrays sort rn buyuk elementi yazdiri
        System.out.println("en buyuk element : " + arr[arr.length-1]);
        System.out.println("en kucuk element : " + arr[0]);
    }
}
