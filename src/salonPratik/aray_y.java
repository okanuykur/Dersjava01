package salonPratik;

import java.util.Arrays;

public class aray_y {

    public static void main(String[] args) {

        //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.
        int [] arr= {50,60,70};

        arr=elart(arr);

        System.out.println(Arrays.toString(arr));


    }

    public static int[] elart(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
             arr[i]= arr[i]+2;


        }

        return arr;
    }
}
