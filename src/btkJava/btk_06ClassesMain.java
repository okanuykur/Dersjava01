package btkJava;

public class btk_06ClassesMain {
    public static void main(String[] args) {

        btk_06DortIslemClass dortIslem=new btk_06DortIslemClass();
        int sonuc= dortIslem.Topla(3,4);
        System.out.println(sonuc);
        System.out.println(dortIslem.Bol(45, 5));
        System.out.println(dortIslem.Cikar(56, 9));
        System.out.println(dortIslem.Carp(4, 5));

    }
}
