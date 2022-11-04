package ders26_passByvalue_ImmutableClasses;

public class C01_PassByValue {

    public static void main(String[] args) {
        double fiyat = 200;



        System.out.println(indirimUygula(fiyat));
        System.out.println(fiyat);
    }

    /*
    kodlarimizin anlasilir olmasi icin main methoddan diger methodlara parametre olarak
    gonderdigimiz variableler icin ayni isimli variable
    olustirmayi tercih ederiz
     */

    private static double indirimUygula(double fiyat) {

        fiyat=fiyat*0.9;

        return fiyat;
    }

    }

