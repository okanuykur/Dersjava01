package ders08_Ternary_switch;

public class C03_Ternary {

    public static void main(String[] args) {

        int a = 5;

        /*
        Ternary operatoru tek basina kullanilamaz
        ternary bize bir sonuc uretir
        bu sonucu ya direk yazdirmali ya da bir veriable ye atamaliyiz
         */

       String sonuc= a%2==0 ? "cift sayi" : "tek sayi";
       /*
       Ternary in sonucunu bir veriable ye atayacaksak
       true ve false durumlarinda uretilecek sonucun
       ayni data turune uygun olmasi gerekir
       aksi halde CTE olusur
        */

       String sonuc2= a>10 ? " buyuk sayi" : ""+2*a; //CTE (altini cizme) vermemesi icin Stringe cevirdik

        System.out.println( a>10 ? " buyuk sayi" : 2*a);

    }
}
