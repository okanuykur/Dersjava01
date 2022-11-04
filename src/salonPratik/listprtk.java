package salonPratik;

import java.util.ArrayList;
import java.util.List;

public class listprtk {

    public static void main(String[] args) {

      List<Integer> sayilar = new ArrayList<>();

      sayilar.add(90);

        System.out.println(sayilar);

        sayilar.add(100);

        System.out.println(sayilar);

        sayilar.add(1,56);

        System.out.println(sayilar);

        sayilar.add(0,1);

        System.out.println(sayilar);

      List <Integer> eklncklst = new ArrayList<>();

      eklncklst.add(99);
      eklncklst.add(98);

      sayilar.addAll(eklncklst);

        System.out.println(sayilar);

        eklncklst.add(100);
        eklncklst.add(101);

        sayilar.addAll(eklncklst);

        System.out.println(sayilar);


        sayilar.add(0,33);

        System.out.println(sayilar);

        eklncklst.add(44);

        sayilar.addAll(eklncklst);

        System.out.println(sayilar);
    }
}
