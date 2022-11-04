package ders14_Method_Olusturma;

public class C03_StringTerseCevirme {

    // parametre olarak bir stringi kabul edip
    // stringin terse cevrilmis halini donduren bir method olusturun

    public static void main(String[] args) {

        String input = "java kod yazdikca ogrenilir";

        System.out.println(stringTerseCevir(input));

        System.out.println(stringTerseCevir("ali ipek"));

    }

    public static String stringTerseCevir (String input){

        String tersStr= "";

        for (int i = input.length()-1; i >=0 ; i--) {

            tersStr= tersStr+input.charAt(i);

        }

        return tersStr;
    }




}
