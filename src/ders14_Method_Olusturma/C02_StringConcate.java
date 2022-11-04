package ders14_Method_Olusturma;

public class C02_StringConcate {

      // verilen iki Stringi parametre olarak kabul edip
    // bu iki stringi aralarinda bir bosluk olan tek bir string olarak
    // main methoda donduren bir method olusturun




    public static void main(String[] args) {

        String input1 = " java";
        String input2 = "guzeldir";
        System.out.println(birlestirmeMethodu(input1, input2)); // java guzeldir
        System.out.println(birlestirmeMethodu("kod yazmak ", "daha da guzeldir")); // kod yazmak daha da guzeldir


    }

    public static String birlestirmeMethodu(String input1 , String input2){


         return input1 + " " + input2; // dondurulecek islem
    }

}
