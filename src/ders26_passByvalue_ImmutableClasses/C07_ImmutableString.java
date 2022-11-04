package ders26_passByvalue_ImmutableClasses;

public class C07_ImmutableString {

    public static void main(String[] args) {

        String str= "Java candir";

        str=str.toUpperCase();
        System.out.println(str);

        /*
        immutable classlardan olusturulan bir objenin degeri degismez
        eger atama yaparsak java degerini degistirmez
        bunun yerine yeni bir obje ollusturur
        ve bu yeni objeye yeni atadigimiz degeri atar

        eski obje bose cikar ve garbage collector tarafindan silnmeyi bekler
         */

    }
}
