package ders10_StringManipulations;

public class C05_Soru {

    public static void main(String[] args) {

        /*
        mail kontrolu yapan bir program hazirlayin
        1- mail @ isareti icermiyor ise  "gecersiz email"
        2- @gmail.com icermiyorsa "gmail adresi giriniz"
        3- @gmail.com ile bitmiyorsa "yazim hatasi"
        seklinde sonuc yazdirin

         */

        String email = "ahmetbulutluoz@gmail.com";

        if (!email.contains("@")){
            System.out.println("gecersiz mail");


        } else if (!email.contains("@gmail")){
            System.out.println("gmail adresi giriniz");

        } else if (!email.endsWith("@gmail.com")){
            System.out.println("yazim hatasi");
        }

        else {
            System.out.println("email basari ile kaydedildi");
        }






    }
}

