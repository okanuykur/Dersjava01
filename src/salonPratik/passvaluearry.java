package salonPratik;

import java.util.Arrays;

public class passvaluearry {

    public static void main(String[] args) {

        int[] arr = {9,8,7};




        System.out.println(Arrays.toString(arr));

    }
    public static void elemntlri9arrtr(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i]+9;
        }

        System.out.println(Arrays.toString(arr));
    }

}
