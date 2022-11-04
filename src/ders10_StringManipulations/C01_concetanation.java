package ders10_StringManipulations;

public class C01_concetanation {
    public static void main(String[] args) {


        String str1= "Java";
        String str2 = "Guzeldir";
        boolean bl = true;
        int sayi = 20;
        double dbl = 3.54;

        System.out.println(str1+bl+sayi); // Javatrue20 yazdirir

        // concat () sadece string veriable leri birlestirmek icin yapilir

        System.out.println(str1.concat(" ").concat(str2));

    }
}
