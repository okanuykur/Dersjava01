package salonPratik;

public class c09_mdaelementtopla {

    public static void main(String[] args) {

        int[] arr1= {23,45,67};

        int toplam= 0;

        for (int i = 0; i <arr1.length ; i++) {
            toplam+= arr1[i];

        }
         int[][] arr= {{90,80},{78,98},{65,56}};

        toplam=0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                toplam+=arr[i][j];

            }

        }

        System.out.println("2 katli elementin toplami : " + toplam);



    }
}
