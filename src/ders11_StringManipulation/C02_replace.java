package ders11_StringManipulation;

public class C02_replace {

    public static void main(String[] args) {
        // replace methodu ile ister karakterlerin kucukluk buyukluk durumlarini
        // isterse de kelimeleri degistirebiliriz

        String str= "Java candir ";

        System.out.println(str.replace("a", "A")); //JAvA cAndir

        System.out.println(str.replace(' ', '_'));// Java_candir_

        System.out.println(str.replace("candir", "cok guzeldir"));//Java cok guzeldir

        System.out.println(str.replace(" ", "")); //Javacandir

        // string deki butun a lari silin
        System.out.println(str.replace("a", "")); //Jv cndr

        //Java yerine Hava, candir yerine cok guzel yazdirin
        System.out.println(str.replace("Java", "Hava")

                .replace("candir" ,"cok guzel")); // Hava cok guzel

          // sadece 1. a yi A yapin

        System.out.println(str.replaceFirst("a", "A")); // JAva candir



    }
}
