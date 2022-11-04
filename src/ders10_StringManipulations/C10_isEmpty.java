package ders10_StringManipulations;

public class C10_isEmpty {
    public static void main(String[] args) {


     // isEmpty methodu bosluk olup olmadigini kontrol eder

        String str= "";
        System.out.println(str.isEmpty()); // true

        str="  ";
        System.out.println(str.isEmpty()); // false

        // bir de blank methodu var bos mu degil mi onu kontrol eder

        System.out.println(str.isBlank()); // true

        str="x";

        System.out.println(str.isEmpty()); //false
        System.out.println(str.isBlank()); // false

    }
}
