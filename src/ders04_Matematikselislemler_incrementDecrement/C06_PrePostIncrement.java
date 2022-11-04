package ders04_Matematikselislemler_incrementDecrement;

public class C06_PrePostIncrement {

    public static void main(String[] args) {

        int a= 10;

        // a variablenin degerini yazdirip , sonra a nin degerini bir arttirin
        System.out.println(a); //10
        a++;
        // a artik 11

        int b = 10;
        //  b  variablenin degerini bir arttirip sonrada yazdirin
        b++;

        System.out.println(b);  //11

        int c = 10;

        // c variablenin degerini yazdirip , sonra c nin degerini bir arttirin

        System.out.println(" c : " + c++);

        int d = 10 ;

        //  d  variablenin degerini bir arttirip sonrada yazdirin

        System.out.println(" d : " + ++d);

        /*
        c++ veya ++d yi yazdirma veya atama islemlerinde kullanirsaniz
         c++ ' e post increment denir o satir icin once islemi yapar sonra arttirmayi yapar
         ++d ' ye ise pre increment denir , once arttirma yapip sonra islemi yapar

         islemin oldugu satirin bir alt satirina gecildiginde c ' de d ' de bir artmistir


         */














    }


}
