package ders26_passByvalue_ImmutableClasses;

import java.util.Arrays;

public class C03_PassByValueArray {

    public static void main(String[] args) {
        // verilen bir arrayin elementlerini 5 arttirip
        // sonra yazdiran bir method olusturun

        int[] arr = {3,4,5};

        elementleri5Arttir(arr);
        elementleri5Arttir(arr);
        elementleri5Arttir(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void  elementleri5Arttir(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = arr[i]+5;
        }

        System.out.println(Arrays.toString(arr));
    }
}
