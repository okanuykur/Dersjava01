package ders14_Method_Olusturma;

public class C05_SubStringOlustur {

      // Soru - 1 Kullanicidan input olarak verilen bir string
    // baslangic ve bitis indexlerine gore baslangic indexi dahil , bitis indexi haric olacak sekilde
    // aradaki harfleri yazdiran bir method olusturun.
    // - kullanici baslangic degeri olarak , bitis degerinden buyuk bir sayi girerse hata meseji verin
    // - kullanici str da olan inexlerden daha buyuk bir index girerse hata meseji jazdirin

    public static void main(String[] args) {

        String input = "Java ne kadar guzel";

        int basIndexi = 5;

        int bitIndexi = 7;

        kendiSubstringMethodumuz(input,basIndexi,bitIndexi); // ne
        kendiSubstringMethodumuz("Java",1,3); //av
        kendiSubstringMethodumuz("deneme",6,3);





    }

    public static void kendiSubstringMethodumuz(String input, int basIndexi , int bitIndexi){

        if (basIndexi>basIndexi){

            System.out.println("baslangic indexi bitis indexinden buyuk olamaz");

        } else if (bitIndexi>=input.length()) {

            System.out.println("bitis indexi stringin sinirlari disinda");


        }else {
            for (int i = basIndexi; i <bitIndexi ; i++) {

                System.out.print(input.charAt(i));


            }
            System.out.println("");

        }
    }

}
