package ders14_Method_Olusturma;

public class C06_Soru {

    /*
    Soru 2 Kullanicidan main method icinde
    // ayri ayri isim ve soyisim alin
    // isim ve soyismi ilk harfleri buyuk olacak sekilde duzenleyip
    // isim bosluk soyisim seklinde bize donduren bir method olusturun
    // input : Ali soyisim: YILMAZ   output : Ali Yilmaz
     */

    public static void main(String[] args) {


        String isim = "OMER";

        String soyisim = "kesen";

        System.out.println(isimSoyisimDuzenle(isim, soyisim));

        System.out.println(isimSoyisimDuzenle("heysem", "renkoglu"));


    }


    public static String isimSoyisimDuzenle (String isim , String soyIsim){

        String yeniIsimSoyisim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase()+
                " " +
                soyIsim.substring(0,1).toUpperCase()+
                soyIsim.substring(1).toLowerCase();


        return yeniIsimSoyisim;






    }

}
