package ders09_StringManipulations;

import java.util.Locale;

public class C01_toUpperCase {
    public static void main(String[] args) {

        // toUpperCase methodu ile verilen stringleri buyuk harfe ceviririz

        String  str = "Java Mutluluktur";
        System.out.println(str.toUpperCase()); // JAVA MUTLULUKTUR

        str = str.toUpperCase();
        System.out.println(str);  // JAVA MUTLULUKTUR

        str = "ince mehmet";
        str = str.toUpperCase();
        System.out.println(str); // INCE MEHMET

        System.out.println(str.toUpperCase(Locale.CHINA)); // INCE MEHMET
        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR"))); // INCE MEHMET








    }
}
