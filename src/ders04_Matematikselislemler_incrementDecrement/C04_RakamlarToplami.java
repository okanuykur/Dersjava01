package ders04_Matematikselislemler_incrementDecrement;

public class C04_RakamlarToplami {

    public static void main(String[] args) {

        //  kullanicinin girdigi 4 basamakli bir sayinin
        // rakamlar toplamini veren bir kod yaziniz

        int intput= 1453;

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;


        // 1. birler basamagini al
        birlerBasamagi = intput % 10 ; //3
        // 2. birler basamagini rakamlar toplamina ekle

        rakamlarToplami= rakamlarToplami +birlerBasamagi; // 3


        // 3. birler basamagindan kurtul
        intput = intput/10;


        birlerBasamagi = intput % 10 ; // 5



        rakamlarToplami= rakamlarToplami +birlerBasamagi; //8



        intput = intput/10;

        birlerBasamagi = intput % 10 ; //4



        rakamlarToplami= rakamlarToplami +birlerBasamagi; // 12



        intput = intput/10;

        birlerBasamagi = intput % 10 ; // 1



        rakamlarToplami= rakamlarToplami +birlerBasamagi; // 13



        intput = intput/10;

        System.out.println(" Verilen sayinin rakamlar toplami : " + rakamlarToplami);







    }
}
