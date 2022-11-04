package ders12_ForLoops;

public class C01_ForLoops {

    public static void main(String[] args) {


        // For loops , belirli bir sayida calistirilmasi gereken bir donguyu,
        // verimli bir sekilde yazmaniza olanak taniyan bir tekrar kontrol yapisidir

        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");

        }
        System.out.println("");

        for (int i = 0; i <=5 ; i++) {
            System.out.print(i + " ");

        }

        System.out.println("");
        
        // 2 basamakli sayilardan 7 ile tam bolunenleri yan yana yazdirin

        for (int i = 10; i <100; i++) {

            if (i%7==0)
                System.out.print(i +" ");
        }

        // 2 basamakli sayilardan 9 ile tam bolunenleri alt alta yazdirin

        for (int i = 10; i <100 ; i++) {
            if (i%9==0) System.out.print(i + " ");

        }

        // 13 den baslayarak 100 e kadar 7 ser 7 ser arttirip yazdiralim

        for (int i = 13; i <=100 ; i+=7) {
            System.out.print(i+" ");

        }

        System.out.println("");

        // 0 dan baslayarak 30 a kadar 3 er 3 er arttiralim

        for (int i = 0; i <=30 ; i+=3) {
            System.out.print(i+" ");

        }


        System.out.println("");
        // 1 den 10 a kadar sinirlar dahil sayilarin karelerini yazdiralim

        for (int i =1 ; i <=10 ; i++) {

            System.out.print(i*i + " ");

        }










    }
}
