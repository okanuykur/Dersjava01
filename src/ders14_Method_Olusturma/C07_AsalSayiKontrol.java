package ders14_Method_Olusturma;

public class C07_AsalSayiKontrol {

    // Soru 3 Kullanicidan main method icinde pozotof bir tamsai alin
    // girilen sayinin asal sayi olup olmadigini kontrol edin
    // sonuc olarak "asal sayi" veya "asal sayi degil" sonuclarini donduren bir method olusturun

    public static void main(String[] args) {

        int sayi = 23;


        System.out.println(asalSayiKontrolEt(sayi)); // asal
        System.out.println(asalSayiKontrolEt(24)); // asal degil
    }

    public static String asalSayiKontrolEt(int sayi){
         String sonuc="";

        for (int i = 2; i <=(sayi-1) ; i++) {

            if (sayi%i==0){

            sonuc= "asal degil";

            break;

            }


        }

        if (!sonuc.equals("asal degil")){

            sonuc= "asal";

        }
        return sonuc;

    }
}
