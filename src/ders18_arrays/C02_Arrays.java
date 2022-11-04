package ders18_arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        String [] arr= {"ali", "ulus", "nesrin"};// ali ulus nesrin

        // bu arrayin tum elementlerini aralarinda bir bosluk birakarak yazdiralim

        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        // bu arrayi array olarak  yazdiralim

        System.out.println(arr);

        // array bir obje- / non-primative data oldugundan java referansini yazdirir
        // array i array olarak yazdirmak isterseniz arrays clasindan yardim alamazsiniz


        System.out.println(Arrays.toString(arr)); //  [ali , ulus, nesrin ]

    }
}
