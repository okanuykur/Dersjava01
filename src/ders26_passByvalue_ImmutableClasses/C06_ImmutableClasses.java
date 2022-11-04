package ders26_passByvalue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C06_ImmutableClasses {

    public static void main(String[] args) {

        String  str= "java guzeldir";

        System.out.println(str.toUpperCase());

        System.out.println(str);
        str.toLowerCase();
        System.out.println(str);

        // sitring bir inmutable oldugu icin method ile yapilan defgisiklikler
        // stringi kalici degistirmez

        List<String> harfler= new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.remove(0);
        System.out.println(harfler);

        // list ve array mutable olduklari icin method ile yapilan degisiklilker kalici olur

    }
}
