package ders24_constructor;

public class ArabaRunnetr {

    public static void main(String[] args) {


        Araba arb1= new Araba();

        arb1.marka="citroen";
        arb1.model="c3";
        arb1.yakit="benzin";
        arb1.yil=2020;
        arb1.fiyat=20000;

        System.out.println(arb1);

        Araba arb2= new Araba("volvo","cx60");

        System.out.println(arb2);

        Araba arb3= new Araba("opel","corsa",10000);

        System.out.println(arb3);

        Araba arb4= new Araba("mercedes","e250","benzin",2022,33000);
        System.out.println(arb4);

    }
}
