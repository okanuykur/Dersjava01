package salonPratik;

import java.util.Arrays;

public class C01_multidimensionelarray {

    public static void main(String[] args) {

        int [][] arr= {{23,},{4,5},{6,7},{8,9,1}};

        System.out.println(arr.length); // 4

        System.out.println(arr[3].length); //3
        System.out.println(Arrays.toString(arr[1])); // [4, 5]

        System.out.println(Arrays.toString(arr[3]));//[8, 9, 1]

        System.out.println(Arrays.deepToString(arr)); //[[23], [4, 5], [6, 7], [8, 9, 1]]

        System.out.println(arr[2][1]); //7

        System.out.println(arr[3][2]); //1


    }
}
