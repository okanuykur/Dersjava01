package ders05_Contantenation_Operatorler;

public class C01_Contantinaion {
    public static void main(String[] args) {

        // sadece asagidaki variable leri kullanarak istenen degerleri yazdiralim

        String s1 = "Java";
        String s2 = " Guzeldir";
        String s3= ""; // hiclik
        String s4= " "; //space yani bosluk

        int sayi1= 4;
        int sayi2= 3;

        // Java Guzeldir7

        System.out.println(s1+s4+s2+(sayi1+sayi2));

        // Java Guzeldir 12  yi yazdiralim

        System.out.println(s1+s4+s2+s4+(sayi1*sayi2)); // burda paranteze almasak da olur cunku islem onceligi olarak
        // java zaten carpma islemi ile baslar

        // 7 Java Guzeldir i yazdiralim

        System.out.println((sayi1+sayi2)+s4+s1+s4+s2); // burda sayi1+sayi2 yi paranteze almasak da olur
        // cunku java zaten isleme soldan baslar

        // 34 Java yazdiralim

        System.out.println(s3+sayi2+sayi1+s4+s1); // eger bir variableyi stringlestirmek istoyirsak o islemin basina
        // veya ortasina hiclik "" isaretini koymamiz gerekir


        // Java7 Guzeldir43 yazdiralim

        System.out.println(s1+(sayi1+sayi2)+s4+s2+s3+sayi1+sayi2);

        // 7Java 43Guzeldir yazdiralim

        System.out.println(sayi1+sayi2+s1+s4+s3+sayi1+sayi2+s2);

    }
}
