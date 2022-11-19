package ders35_exceptions;

import java.util.Scanner;

public class C03_ArrayIndexOutBoundException {

    public static void main(String[] args) {
        //kullanicidan bir index isteyin
        // verilen bir arrayde kullanicinin girdigi index teki elementi yazdirin

        int[] arr= {2,3,4,5,6,7,8,9,1,2,4};

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir index giriniz");
        int index= scan.nextInt();

        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException hata) {

            System.out.println(hata.getMessage());//Index 56 out of bounds for length 11
            hata.printStackTrace();
        }
    }
}
