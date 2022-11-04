package ders09_StringManipulations;

public class C04_charAt {
    public static void main(String[] args) {

        /*

         5. str.charAt( istenenIndex );
         Verilen bir String’in istenen index’indeki char karakteri bize döndürür
         NOT 1: Java’da index 0’dan baslar. Ilk harfe ulasmak icin str.charAt(0); yazmalisiniz
         NOT 2: Index 0’dan basladigi icin son index toplamKaraktersayisi -1 olacaktir.
         Yukaridaki ornekte karakter sayisi 11 iken, son harfe ulasmak icin charAt(10);
         kullanilmalidir.
          NOT 3: Son index’den daha buyuk bir index yazdiginizda java hata verir

         */

        String str = "Java Candir";

        System.out.println(str.charAt(0)); // ilk jarfi verir
        System.out.println(str.charAt(1)); // ikinci harf olan 'a' yi verir
        System.out.println(str.charAt(5)); // 5. indeksteki char olan 'c' yi  verir
        System.out.println(str.charAt(10)); // bana sonuncu karakter olan 'r' yi yazdirir


        String str2= "javayi rahat ogreniyorum";

        System.out.println(str2.charAt(0)); // 'j'
        System.out.println(str2.charAt(13)); // 'o'
    }
}
