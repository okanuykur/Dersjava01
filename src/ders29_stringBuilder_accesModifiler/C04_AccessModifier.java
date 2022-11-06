package ders29_stringBuilder_accesModifiler;

public class C04_AccessModifier {



        String isim = "Ali"; // acces modifier gorunmuyor o zaman default access modifier gecerlididr
                            // bu classdan ve ders 29 package icerisindeki classdan kullanilir

       private  static  int sayi=10;
    public static void main(String[] args) {

        System.out.println(sayi);
        sayi=29;
        System.out.println(sayi);



    }
}
