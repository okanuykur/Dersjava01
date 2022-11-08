package ders31_inheritance;

public class GCorolla extends FToyota {

    String model ="corolla";
    String uretimYeri= "turkiye";

    GCorolla (){
        super();
        System.out.println("corolla cons. calisti");
    }

    public static void main(String[] args) {

        GCorolla corolla1= new GCorolla();

        System.out.println(corolla1.marka);//toyota

        /*
        bir child clasda obje olusturdugumuzda
        olusturulan obje sadece child classa ait ozellikleri degil
        tum parent classlarindaki ozellikleri tasir

        bir objenin bir classin ozelliklerini tasimasi icin
        o obje olusturulurken classa ait contructor in calismis olmasi gerekir

        yani child classindaki constructorlar da otomatik olarak calisir

        java bu islem icin soyle bir mekanizma gelistirmistir

        bir class olusturdgumzda biz constructor olusturmasak da
         java nin o classa default constructor koydugu gibi
         extends keyword kullanan bir classda olusturulan her bir constructorin
         ilk satirina biz gorsek de gormesek de super () constructor call koyar

         */




    }
}
