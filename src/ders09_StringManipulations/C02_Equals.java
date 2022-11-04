package ders09_StringManipulations;

public class C02_Equals {
    public static void main(String[] args) {
       /*
       3. str.equals( baskaStr ); Verilen iki String’in metinlerini karsilastirir. Iki String
       birbiriyle ayni metinleri iceriyorsa true, herhangi bir farklilik
       varsa false dondurur.
        */


       String str1= "Ali";
       String str2= "ali";
       String str3 = "Ali";

        System.out.println(str1==str2); // false
        System.out.println(str1==str3); // true

        /*
        == Stringleri karsilastiriken bekledigimiz sonuclari vermeyebilir
        Stringlerde metinlerin ayni olup olmadigini karsilastirmak icin
        == yerine equals() kullanilir
         */

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // true
        System.out.println(str2.equals(str3));  // false

        String str4= "KALEM";
        String str5= "Kalem";
        String str6 = "kalem";
        String str7 = "KALEM";

        System.out.println(str4.equals(str5)); //false
        System.out.println(str5.equals(str6)); // false
        System.out.println(str6.equals(str4)); // false
        System.out.println(str7.equals(str4));  // true
    }
}
