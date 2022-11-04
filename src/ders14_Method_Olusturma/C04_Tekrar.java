package ders14_Method_Olusturma;

public class C04_Tekrar {

    public static void main(String[] args) {

       int a = 10;
       int b= 20;

        System.out.println(C01_carpim.carpimMethodu(a, b)); //200.0

          String c = "nasil";

          String d = "ya";

          // bu iki strinfi aralarinda bir bosluk olacak sekilde yazdirin


        System.out.println(C02_StringConcate.birlestirmeMethodu(c, d)); // nasil ya

         String e = "bu da mi gol degil";

         // e stringini tersten yazdirin

        System.out.println(C03_StringTerseCevirme.stringTerseCevir(e)); // liged log im ad ub


        // bu cumleyi terse cevirin

        System.out.println(C03_StringTerseCevirme.stringTerseCevir("bu cumleyi terse cevirin"));

    }
}
