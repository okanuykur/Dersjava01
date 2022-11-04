package ders04_Matematikselislemler_incrementDecrement;

public class C05_IncrementDecrement {

    public static void main(String[] args) {


        int sayi = 10;

        // bu sayiyi 3 arttiralim ve yazdiralim
        sayi = sayi+3;
        System.out.println(sayi);  //13

        sayi +=+3;

        System.out.println(sayi); //16

        int s = 10 ;

        // bu sayiyi 1 arttiralim

        s = s+1;
        System.out.println(s);  //11

        s+=1;
        System.out.println(s);  // 12

        s++;
        System.out.println(s);  //13

        ++s;
        System.out.println(s);  //14

        int t= 10;

        // bu sayinin degerini 3 eksiltlim

        t =t-3;
        System.out.println(t); //7

        t-=3;
        System.out.println(t); //4

        --t;
        System.out.println(t); // 3

        t--;
        System.out.println(t);  //2








    }
}
