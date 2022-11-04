package ders11_StringManipulation;

public class C07_soru {

    public static void main(String[] args) {


        // soru : kullanicidan isim ve soy ismini ayri ayri alin
        // ismi daha uzun ise , isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        // soyisim daha uzun ise ismin ilk harf buyuk digerleri kucuk soyismi buyuk harflerle yazdirin


        String isim = "Mehmet";
        String soyIsim = "Harun";
        String yenIsimSoyisim;


         if (isim.length()>soyIsim.length()){
            // isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin


             yenIsimSoyisim = isim.substring(0,1).toUpperCase()+
                                  isim.substring(1).toLowerCase()+
                                  " "+
                                  soyIsim.substring(0,1).toUpperCase()+
                                  soyIsim.substring(1).toLowerCase();

         } else {
            //ise ismin ilk harf buyuk digerleri kucuk soyismi buyuk harflerle yazdirin
            yenIsimSoyisim= isim.substring(0,1).toUpperCase()+
                            isim.substring(1).toLowerCase()+
                            " "+
                            soyIsim.toUpperCase();


         }
        System.out.println(yenIsimSoyisim);

    }
}
