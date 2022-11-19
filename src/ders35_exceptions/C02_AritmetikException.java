package ders35_exceptions;

public class C02_AritmetikException {
    public static void main(String[] args) {
        // verilen iki tamsayiyi birbirine bolup
        // sonucun tamsayi kismini yazdirin

        int saayi1 =20;
        int sayi2=0;
        try {
            // rskli oldugunu on gordugumuz kodlar
            System.out.println(saayi1/sayi2);
            System.out.println("bakalim bu satir calisacak mi");
        } catch (ArithmeticException e) {
            //catch (ArithmeticException e) ongordugumuz risk
            System.out.println("sayi sifira bolunemez");
            //beklenen rsik gerceklesir ise calisacak kodlar
        }

        /*
        bazi exceptionlar ilf else ile handle edilebilir
        ancak tum exceptionlar icin if else yeterli olmaz
         */
    }
}
