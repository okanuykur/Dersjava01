package salonPratik;

import ders18_arrays.C03_ArraysElementleriniArttirma;
import ders18_arrays.C04_ArrayElementleriToplama;
import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;
import java.util.Scanner;

public class toUppercase {
    public static void main(String[] args) {


       int[] abc={3,5,6,7};
       int eklncksy =1;

       abc=arryelmetekle(abc,eklncksy);

        System.out.println(Arrays.toString(abc));

    }
    public static int[] arryelmetekle (int[] eklenecekarr,int eklenceksy){

        int[] yeniar=new int[eklenecekarr.length+1];
        for (int i = 0; i <eklenecekarr.length ; i++) {
            yeniar[i]=eklenecekarr[i];
        }

        yeniar[yeniar.length-1]=eklenceksy;
        return yeniar;
    }

     }


