package ders21_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlariSilme {

    public static void main(String[] args) {

        //  verilen bir arayde ki tekrar eden sayilari
        //  bir kere olacak sekilde arrayi duzenleyin

        int[] arr= {1,2,4,3,5,3,2,5,1,2,4,5,4,3,4,};

        // bu soruyu arrayle yapmak cok zordur

        // bunun yerine bu arrayin elemanlarini tek tek inceleyip
        // tekrarsiz olanlari bir liste atalim

        List<Integer> tekrarsizListe = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (!tekrarsizListe.contains(arr[i])){
                tekrarsizListe.add(arr[i]);
            }
        }

        System.out.println("tekrarsiz liste : " + tekrarsizListe); //tekrarsiz liste : [1, 2, 4, 3, 5]

        // en son o listdeki elementleri iceren bir array nolusturup
        // yeni arrayi eski arraye deger olarak atayalim

        arr= new int[tekrarsizListe.size()]; // [0,0,0,0,0,]

        for (int i = 0; i <arr.length ; i++) {

            arr[i]= tekrarsizListe.get(i);

        }

        // array istene hale geldi

        System.out.println("arrayin tekrarsiz hali : " +Arrays.toString(arr));





    }
}
