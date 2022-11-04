package ders11_StringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {
        //null dmek yer ayrima demek daha sonra deger atilacagini bildirir bir nevi rezerve
        // deger degil isaretcidir
        // String isim1= ""; isim1 e bir deger atanmistir . bu degeri yazdirabilir veya methodlarda
        // kullanabilir


        String str1= "";

        // str1 e deger atanmistir

        System.out.println(str1);// hiclik
        System.out.println(str1.concat("Java")); //Java

        String str2;
        //str2 olusturuldu ama deger atanmadi


       // System.out.println(str2);// str2 ye deger atanmadigi icin yazdirilamaz CTE verir

       //  System.out.println(str2.concat("Java")); //str2 ye deger atanmadigi icin methodla kullanilamaz


        str2="Java candir";

        System.out.println(str2);
        System.out.println(str2.concat("."));// Java candir.

        String str3=null; // str3 e deger atanmamistir
                          // null pointer ile javaya deger atamadigimizin farkinda oldugumuzu soyluyoruz


        System.out.println(str3); // null yazdirir .artik ariza vermiyor. null isaretlendigini yazdirir

        //System.out.println(str3.concat("Java")); //  kod calisir ama null pointer expentic verir

        System.out.println(str3 + "Java"); //nullJava yani normal toplamayi yaptirir

        System.out.println(str3.toLowerCase()); // nullPointerExeption





    }
}
