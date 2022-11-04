package ders15_Overloading_whileLoop;

public class C08_RakamlarToplami {

    public static void main(String[] args) {

     // while loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        int sayi = 1453;


        int birlerBasamagi= 0;

        int rakamalarToplami = 0;

        while (sayi!=0){

            birlerBasamagi=sayi%10;

            rakamalarToplami+= birlerBasamagi;

            sayi/=10;

        }

        System.out.println(rakamalarToplami);

    }
}
