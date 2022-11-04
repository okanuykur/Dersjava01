package ders29_stringBuilder_accesModifiler;

public class C02_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java Candir");

        System.out.println(sb1.reverse());
        System.out.println("Tersini yazdiktan sonra sb1 : " + sb1);

        System.out.println(sb1.insert(0,"."));

        System.out.println(sb1);
        sb1.reverse();

        StringBuilder sb2= new StringBuilder("Java Candir.");

        String str= "Java Candir.";

        System.out.println(sb1==sb2);//false  icerik ayni olsa bile false verir
        System.out.println(sb1==sb1);//true sadece bir sb keendisi ile karsilastirilsa true verir
        //System.out.println(sb1==str); farkli iki data turu karsilastirilamaz

        System.out.println(sb1.equals(sb2)); // icerik ayni olsa bile false verir
        System.out.println(sb1.equals(sb1));//true sadece bir sb keendisi ile karsilastirilsa true verir
        System.out.println(sb1.equals(str));//

        System.out.println(sb1.compareTo(sb2));//0
        StringBuilder sb3=new StringBuilder("Hava Candir");
        System.out.println(sb1.compareTo(sb3));
    }
}
