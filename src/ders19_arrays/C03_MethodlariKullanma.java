package ders19_arrays;

import ders18_arrays.C03_ArraysElementleriniArttirma;
import ders18_arrays.C04_ArrayElementleriToplama;
import ders18_arrays.C05_ArraydeElemanArama;
import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {

    public static void main(String[] args) {
        // verilen bir int arrayin elementlerini 2 arttirin

        int[] arr={2,3,4};

       arr= C03_ArraysElementleriniArttirma.elementleri2arttir(arr);

        System.out.println(Arrays.toString(arr));

       // arr array in elementlerini toplayip sonucu yazdirin
        System.out.println(C04_ArrayElementleriToplama.pozitifElemanlariTopla(arr));

        // arr arrayinde 10 element olarak var mi
        C05_ArraydeElemanArama.elemanAra(arr,10);//aranan sayi array de yok

        // kullanicidan bir deger alarak array olusturun

       int[] yeniArr= C06_KullaniciyaArrayOlusturma.arrayOlusturun();
       Arrays.toString(yeniArr);

    }
}
