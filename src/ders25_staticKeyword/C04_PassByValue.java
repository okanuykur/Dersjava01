package ders25_staticKeyword;

public class C04_PassByValue {

    public static void main(String[] args) {
        double fiyat = 100;

        indirimUygula(fiyat);

        System.out.println(indirimUygula(fiyat));
        System.out.println(fiyat);
    }

    private static double indirimUygula(double fiyat) {

        fiyat=fiyat*0.9;

        return fiyat;
    }
}
