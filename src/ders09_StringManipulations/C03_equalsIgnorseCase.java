package ders09_StringManipulations;

public class C03_equalsIgnorseCase {
    public static void main(String[] args) {

        /*
        4. str.equalsIgnoreCase( baskaStr );
        Verilen iki String’in metinlerini karsilastirir. Case-sensitive olmadan birbiriyle ayni
        metinleri iceriyorsa true, herhangi bir farklilik varsa false dondurur

         */


        String str1 = "Ali";
        String str2 = "ali";
        String str3 = "ALI";

       // equals yintemi ile false olanlar
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // false

       // equalsIgnorCase methodu ile true oldu
        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3)); // true

        /*
        NOT : equalsIgnoreCase( ); sadece buyuk / kucuk harf farkliliklarini ignore eder, farkli
        bir karakter bulunmasi durumunda herzaman false donecektir (bosluk da bir
        karakterdir)
         */

        String str4= "pinar zelal";
        String str5 = "Pinar Zelal";
        String str6 = "PINAR zelal ";

        System.out.println(str4.equalsIgnoreCase(str5));
        System.out.println(str6.equalsIgnoreCase(str4));

    }
}
