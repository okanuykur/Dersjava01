package salonPratik;

import java.util.ArrayList;
import java.util.List;

public class pasvalu {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(7);
        sayilar.add(8);
        sayilar.add(9);

        elementlri7arttir(sayilar);
        elementlri7arttir(sayilar);
        elementlri7arttir(sayilar);

        System.out.println(sayilar);
        System.out.println(sayilar);
        elementlri7arttir(sayilar);
        System.out.println(sayilar);
    }

    public static void elementlri7arttir(List<Integer>sayilar){
        for (int i = 0; i <sayilar.size(); i++) {
            sayilar.set(i, sayilar.get(i)+7);




        }

        System.out.println(sayilar);
    }
}
