package ders10_StringManipulations;

public class C02_contains {
    public static void main(String[] args) {
        // contains bir booelean methodudur ve sorulan degerin string icinde olup olmadigini sorar

        String str= "Java ile kodlama cok zevkli";

        System.out.println(str.contains("ile")); //true
        System.out.println(str.contains("cok")); //true
        System.out.println(str.contains("odla"));//true
        System.out.println(str.contains("a")); //true
        System.out.println(str.contains("java"));//false kucuk harf

        String str2= "Java";
        System.out.println(str.contains(str2)); //true



    }
}
