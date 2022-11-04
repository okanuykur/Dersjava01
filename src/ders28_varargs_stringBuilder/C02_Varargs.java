package ders28_varargs_stringBuilder;

public class C02_Varargs {

    public static void main(String[] args) {

        topla(5,6);
        topla(5,3,8);
        topla(2,4,6,8);
        topla(4,7,89,90);


        /*
        bir methodda parametrer sayuisini sinirlandrimak istemezsek
        standart bir variable yerine varargs kullaniriz

        varargs data turunun yanina ... nokta konularak deklare edilir
        int... ==> sayisi belirli olmayan integer parametler olan bir arraydir

         */



    }

    private static void topla(int... sayilar) {

        int toplamSonucu=0;

        for (int each:sayilar
        ){
            toplamSonucu+=each;
        }
        System.out.println("girilen sayilarin toplami : " + toplamSonucu);




    }
}
