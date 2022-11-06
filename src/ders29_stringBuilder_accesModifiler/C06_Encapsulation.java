package ders29_stringBuilder_accesModifiler;

import java.util.ArrayList;
import java.util.List;

public class C06_Encapsulation {

    /*
    buyuk projelerde datayi gorme(read) veya datayi defgistirme (write)

    yetkilerini birbirinden bagimsiz olarak duzenlemek istenebilir
    Access modifieler ile class uyelerine baska classlardan erisim sinirlandirilabilir

    ANCAK

    ulasilabilen dataya hem okuma hem yazma yapilabilirken
    ulasilamayan data ne okunabilir ne de degistirilebilir

    gercek hayattaki ihtiyaclar dusunuldugunde
    javaya yetki sinirlamayi uyarlamak istersek

    - eger okuma ve yazma yetkisni birlikte vermek veya vermemek soz konusu ise
    access modifier kullanilabilir

    - eger okuma yazma yetkileri birbirinden ayrilacaksa
    o zaman access modifier yeterli olmaz
    Encapsulation (getter ve setter methodlari) kullanilmalidir


     */

    // grt ve set daha onceki java objelerinde karsimiza cikmisti

    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);

        // sayilar.get(1)=10 get okumaya izin var ama atamaya izin yok

       // System.out.println(sayilar.set(1)); set varsa mutlaka deger atamaliyiz




    }



}
