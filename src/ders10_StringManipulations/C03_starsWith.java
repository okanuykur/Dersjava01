package ders10_StringManipulations;

public class C03_starsWith {

    public static void main(String[] args) {

        // starsWith method stringin ne ile basladigini ogrenmek icin kullanilir
        String str= "manti acarken java ogrenilmez";

        System.out.println(str.startsWith("Manti")); //false
        System.out.println(str.startsWith("manti")); //true
        System.out.println(str.startsWith("manti acarken java ogrenilmez"));//true
        System.out.println(str.startsWith(""));//true

        // bir de starsWith prefix , toffset methodu var o da basta degil de cumlenin herhangi
        // bir yerinde indexin neyle basladigini sorar

        System.out.println(str.startsWith("acarken", 6));// 6.index acarken ile mi basliyor? True
        System.out.println(str.startsWith("manti", 0));//0.index manti ile mi basliyor? True
        System.out.println(str.startsWith("java",10));// 10.index java ile mi basliyor? Flase

    }
}
