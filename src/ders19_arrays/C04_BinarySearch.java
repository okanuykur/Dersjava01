package ders19_arrays;

import java.util.Arrays;

public class C04_BinarySearch {

    public static void main(String[] args) {

        int[] arr= {1,8,9,3,7,2,5,8,1};

        System.out.println(Arrays.binarySearch(arr,8));//7
        System.out.println(Arrays.binarySearch(arr,5));//-2
        System.out.println(Arrays.binarySearch(arr,1)); //0
        System.out.println(Arrays.binarySearch(arr,9)); // -10
        /*
        binary search methodunun dogru fonksiyona donebilmesi
        icin oncelikle sort methodu kullanilmalidir
        sort kullanmadan binarySearch ile yapilan arastirmanin
        sonucu belli olmaz
        dogru sonuc da verebilir ,yanlis da
         */

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,8));//7
        System.out.println(Arrays.binarySearch(arr,5));//-2
        System.out.println(Arrays.binarySearch(arr,1)); //0
        System.out.println(Arrays.binarySearch(arr,9)); // -10

        // array de olmayan bir eleman aratirsak
        // java once o sayi arrayde olsa nerde olur onu bulur
        //sonra buldugu o sirayi - isareti ile verir

        System.out.println(Arrays.binarySearch(arr,-3));//-1
        System.out.println(Arrays.binarySearch(arr,4));//-5
        System.out.println(Arrays.binarySearch(arr,110)); //-10
        System.out.println(Arrays.binarySearch(arr,90)); // -10



    }
}
