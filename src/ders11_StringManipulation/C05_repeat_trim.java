package ders11_StringManipulation;

public class C05_repeat_trim {
    public static void main(String[] args) {


        // reoeat methodu ile bir tekrar sayisi kadar tejrar ettirir


        String str = "java guzeldir ";

        System.out.println(str.repeat(4)); // 4 * java guzeldir


        str= "  Java guzeldir  ";

        System.out.println(str.length()); // 17

        str=str.trim();

        System.out.println(str);  // Java guzeldir trim methodu bastaki ve sondaki bosluklari atti

        System.out.println(str.length()); //  13

    }
}
