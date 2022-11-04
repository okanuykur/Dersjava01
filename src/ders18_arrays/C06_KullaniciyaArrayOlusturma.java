package ders18_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturma {

    public static void main(String[] args) {


        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i
        // olusturan ve bize donduren bir method olusturun.


        int[] kullaniciArrayi=arrayOlusturun();
        System.out.println(Arrays.toString(kullaniciArrayi));
    }

    public static  int[] arrayOlusturun(){

        Scanner scan = new Scanner(System.in);

        System.out.println("olusturulacak arrayin  boyutunu girin");


        int lengt = scan.nextInt();

        int[] kullaniciArrayi = new int[lengt];

        for (int i = 0; i <lengt ; i++) {
            System.out.println("arraye eklenecek  bir sayi giriniz");

            kullaniciArrayi[i]= scan.nextInt();



        }

        return  kullaniciArrayi;
    }
}
