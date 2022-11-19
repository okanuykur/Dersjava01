package ders37_exceptions;

public class C03T_ThrowKeywoard {
    public static void main(String[] args) {

        int sayi=1;
        if (sayi==2){
            throw new RuntimeException();


        }

        try {
            sayi=2;

            sayi=3;

            sayi=4;

            sayi=5;

            sayi=6;
        } catch (RuntimeException e) {

        }

    }
}
