package ders20_multiDimensionelArrays;

import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.*;

public class C08_ArrayList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        C06_KullaniciyaArrayOlusturma obj1=new C06_KullaniciyaArrayOlusturma();

        List <Integer>sayilar= new ArrayList<>();

        // list primitive kabul etmez
        // list bir interface oldugu icin direk obje olusturulamaz
        // onun yerine sag tarafa ArrayList<>() yazariz

        sayilar.add(4);

        sayilar.add(5);
        System.out.println(sayilar);// [4, 5]


          }
    }

