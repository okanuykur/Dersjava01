package ders25_staticKeyword;

public class Deneme {


    int a=10;
    static int b=20;
    String str1="ali";
    static String str2= "ayse";

    Deneme(){

        str1="hasan";
        str2="++";

    }

    Deneme(int x, int y){

        a=x;
        b=y;
    }

    public static void main (String[]args){

        Deneme dnm1= new Deneme(6,8);
        System.out.println(dnm1.b);

        Deneme dnm2= new Deneme(10,12);
        System.out.println(dnm1.b);
    }
}
