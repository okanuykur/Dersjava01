package salonPratik;

public class mdasayilarincarpimi {

    public static void main(String[] args) {

          int [] [] arr = {{43,67} , {1,2} ,{6,7}};
        System.out.println(carp(arr));


    }

    public  static int carp(int[][] arr){

        int carpim=1;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                carpim*=arr[i][j];

            }

        }

        return carpim;

    }
}
