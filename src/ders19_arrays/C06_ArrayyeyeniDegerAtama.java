package ders19_arrays;

import java.util.Arrays;

public class C06_ArrayyeyeniDegerAtama {

    public static void main(String[] args) {


        String str= "java";
        str="hava";


        /*
        var olan bir array in uyumlugu degistirelemez
        var olan bir array e yeni bir array degeri atanabilir
         */

        // 1- var olan arrayi yeni deger olarak atayabiliriz

        String [] arr1={"Ali" , "Veli"};

        String [] arr2= {"A","C","D"};

        arr1=arr2;

        System.out.println(Arrays.toString(arr1)); // A B C

        // istedigimiz uzunlukta yeni bir bos arrayi degeri atayabiliriz

        arr1=new String[6];

        System.out.println(Arrays.toString(arr1)); //[null, null, null, null, null, null]

        //3- yeni olusturulan bir arraye { } icinde deger yazarak atama yapabiliriz
        // ancak var olab bir arraye yeni deger atamasi icin { } kullanilamaz

        //arr1={"g", "h"}; olmaz

        int[] arr= {3,4,5};



    }
}
