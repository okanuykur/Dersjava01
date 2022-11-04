package salonPratik;

import java.util.Arrays;

public class madsr {

    public static void main(String[] args) {

        int [][] arr= {{3,4,5},{2,3,6,7}};

        int ortakndxsys = arr[0].length<arr[1].length ? arr[0].length : arr[1].length;

        int[] ortkindxletoplmarttrArr= new int[ortakndxsys];
        for (int i = 0; i <ortkindxletoplmarttrArr.length ; i++){

            ortkindxletoplmarttrArr[i]= arr[0][i] + arr[1][i];


        }

        System.out.println(Arrays.toString(ortkindxletoplmarttrArr));

    }
}
