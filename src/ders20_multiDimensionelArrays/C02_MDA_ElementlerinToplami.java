package ders20_multiDimensionelArrays;

public class C02_MDA_ElementlerinToplami {
    public static void main(String[] args) {

        int[] arr1= {3,5,7,8};

        int toplam= 0;

        for (int i = 0; i <arr1.length ; i++) {

            toplam+=arr1[i];
        }

        System.out.println("tek katli array elementler toplami : " + toplam);//tek katli array elementler toplami : 23


        int[][] arr= {{1,2}, {3,4,5,} , {7}};
        //elementlerini toplayalim

        toplam=0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length; j++) {

               toplam+= arr[i][j];
            }



        }

        System.out.println("2 katli arrayin toplami : " + toplam);
    }
}
