package ders28_varargs_stringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {
        topla(5,6);
        topla(5,3,8);
        topla(2,4,6,8);

        // parametre sayisi bizden yeni method olusturmamizi istemektedir
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {


        System.out.println("dort sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));

    }

    private static void topla(int sayi1, int sayi2, int sayi3) {

        System.out.println("uc sayinin toplami : " + (sayi1+sayi2+sayi3));
    }

    public  static void topla(int sayi1, int sayi2) {

         System.out.println("iki sayinin toplami : " + (sayi1+sayi2));
    }
}
