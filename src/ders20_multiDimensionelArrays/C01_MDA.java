package ders20_multiDimensionelArrays;

import java.util.Arrays;

public class C01_MDA {

    public static void main(String[] args) {

        int [] [] arr= {{4,3,1} ,{1,2},{5,6,7},{},{3,6,8,0}};

        System.out.println(arr.length); // 5 outer array


        System.out.println(arr[2].length);// {5,6,7} = 3

        System.out.println(arr[1]); //{1,2} direk yazilmaz referansi yazmamiz lazim

        System.out.println(Arrays.toString(arr[1])); //[1, 2]
        // tumarrayi yazdirmak istersek

        System.out.println(Arrays.deepToString(arr)); // [[4, 3, 1], [1, 2], [5, 6, 7], [], [3, 6, 8, 0]]

        System.out.println(arr[3][0]); // ArrayIndexOutOfBoundsException



    }
}
