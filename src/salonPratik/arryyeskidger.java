package salonPratik;

import java.util.Arrays;

public class arryyeskidger {

    public static void main(String[] args) {

        //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.



        int [] arr = {4,7,9,3};

        for (int i = 0; i <arr.length ; i++) {

            arr[i]= arr[i]+2;

        }

        System.out.println(Arrays.toString(arr)); // [6, 9, 11, 5]
        arr= elementlerarttir(arr);

        System.out.println(Arrays.toString(arr)); // [8, 11, 13, 7]

    }

    public static int [] elementlerarttir (int [] arr){

        for (int i = 0; i < arr.length ; i++) {

            arr[i]= arr[i]+2;


        }
        return arr;




    }
}
