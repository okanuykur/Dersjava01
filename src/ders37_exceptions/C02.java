package ders37_exceptions;

public class C02 {
    public static void main(String[] args) {

        short sayi1=23;
        int sayi2= sayi1;

        Short sayi3=24;
        //Integer sayi4=sayi3; integer ve short arasinda parent - child iliskisi olmadigindan
        // birbirine atama yapamazsiniz


        // aralarinda parent-child iliskisi olan classlardan olusan objeler icin
        // auto-widening veya explicit-narrowing mumkundur



        Object obj=sayi3;

        Integer sayi5=(Integer) obj;

        System.out.println("short datayi obje uzerinden integera ceviirnce : " + sayi5);

        //ClassCastException
    }
}
