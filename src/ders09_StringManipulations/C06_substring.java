package ders09_StringManipulations;

public class C06_substring {

    public static void main(String[] args) {

       String str= "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5 ,8)); // gun

        // 5. indexten baslar 5 de dahil 8 e kadar yazdirir 8 i dahil etmeden

        // gectikce yi yazdirin

        System.out.println(str.substring(9,17)); //gectikce
        System.out.println(str.substring(3,7)); //a gu 3. karakter olan a dan baslar 7 ye kadar 7 ui almaz

        String isim = "huseYIN";
        // VERILEN ISMIN ILK HARFI BUYUK GERIYE KALANLAR KUCUK OLARAK KAYDEDIN

        isim= isim.substring(0,1).toUpperCase()+ // ilk harfi alip buyuk harf yaptik
        isim.substring(1).toLowerCase();
        System.out.println(isim);

        System.out.println(isim.substring(2,5)); //sey
        // sadece 3.harfi yazdirin 'e'

        System.out.println(isim.substring(3,4)); //e
        System.out.println(isim.substring(2,2)); // hic bisey yazdirir cunku virgulun sagi dahil edilmez
       // System.out.println(isim.substring(5,2)); olsa hata verir.







    }
}
