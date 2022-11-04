package ders09_StringManipulations;

public class C05_length {

    public static void main(String[] args) {

        /*
          6. str.length( );
          Verilen bir String’deki karakter sayisini bize döndürür

         */

        String str = "Uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length());  // stringin index toplami= 34

        // son karakteri yazdirin
        System.out.println(str.charAt(33)); //u yu charAt methodu ile bulduk
        System.out.println(str.charAt(str.length()-1)); // son karakteri elde etmek icin kullanilir

        // sondan 3. karakteri yazdirin

        System.out.println(str.charAt(str.length()-3)); //g yi verir

        System.out.println(str.charAt(str.length()-16)); // sondan sayarak geride olan a yi verdi

           String str2= "java ogrenmek hem zevkli hem kolaymis";
        System.out.println(str2.length()); //37
    }
}
