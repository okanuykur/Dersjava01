package ders11_StringManipulation;

public class C03_replaceALL {

    public static void main(String[] args) {

        // str.replaceAll () sadece bir harf veya char sequence ' i degil
        // genelleme ile soyleyebilecegimiz ortak ozellikteki tu karakterleri degistirir


        String str= "J1ava G9uzel5dir8";

        // str daki sayilari silip metni yava guzeldir haline getirelim


        System.out.println(str.replaceAll("\\d","")); //Java guzeldir

        System.out.println(str.replaceAll("\\D" ,"")); //1958


        String s1 = "ilk urun fiyati : 1250 tl";
        String s2 = "ikinci urun fiyati :1500";

        // iki urunun fiyatini toplayin

        s1=s1.replaceAll("\\D", ""); //1250
        s2=s2.replaceAll("\\D", ""); //1500

        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); //2750


    }
}
