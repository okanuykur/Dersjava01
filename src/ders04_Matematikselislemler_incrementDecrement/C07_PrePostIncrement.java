package ders04_Matematikselislemler_incrementDecrement;

public class C07_PrePostIncrement {

    public static void main(String[] args) {

        int a = 10;

        int b = a++; // bu post incrementtir ve dolayisiyla once islem sonra arttirma yapilir
        // once islem : b = a yani 10
        // sonra arrtirma  10 + 1 = 11


        int c = ++b;  // bu pre incrementtir dolayisiyla ilk once arttirma yapilir
        //  b  (10) nin degerini 1 arrtiralim = 11
        //  sonra da islem yani atama b nin 11 olan degerini c ye atasak c de 11 olur

        System.out.println(" a: " + a + ", b : " + b + ", c : " + c);

        a = 20;

        b= ++a;  // pre increment dolayisiyla ilk once arttirma ile  a = 21 olur b ' de ondan dolayi esittir 21

        c= a++;  // pro increment ilk once islem yani a nin degeri 21 idi onu c ye atiyoruz c de 21  oluyor
        // 21 olan a ise 1 arttirilarak 22 oluyor


        System.out.println(" a: " + a + ", b : " + b + ", c : " + c);


        a=30;

        System.out.println(a++);

        System.out.println(--a);

        System.out.println(a--);

        System.out.println(a);











    }
}
