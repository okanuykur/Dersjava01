package salonPratik;

public class YeniArabaRunner {

    public static void main(String[] args) {

     YeniAraba araba1 = new YeniAraba();

     araba1.marka= "bmw";
     araba1.model="e500";
     araba1.yakit="benzin";
     araba1.fiyat=44000;
     araba1.yil=2021;

        System.out.println(araba1);

        YeniAraba arb2 = new YeniAraba("cintiroen", "c3");

        System.out.println(arb2);

        YeniAraba araba3 = new YeniAraba("ford" , "fiesta","lpg",2004,17000);
        System.out.println(araba3);




    }
}
