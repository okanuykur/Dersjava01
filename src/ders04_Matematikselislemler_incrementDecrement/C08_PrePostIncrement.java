package ders04_Matematikselislemler_incrementDecrement;

public class C08_PrePostIncrement {

    public static void main(String[] args) {


        int x = 3;

        int y = 2 * ++x; // once arttir yani 3+1=4 4*2=8 y ye ata y =8

        int z = 5 + y--; // once islem 8+5 = 13 yani z = 13 sonra azaltma y= 8 idi simdi de 1 azaltip 7 yapiyoruz

        System.out.println(x+y+z);



        int a=10;

        System.out.println("a'nin degeri : " + ++a);  // a = 11 oldu


        int b = a++; // 11 ye a nin degeri olan 11 i atiyoruz b = 11 oluyor, sonra da a ya 1 ekliyoruz a= 12

        System.out.println("b' nin degeri : " + b);

        int c= b++ + a; // once b + a= 23 yani c = 23 , sonra da b ye 1 ekliyoruz  b = 12

        System.out.println("c' nin degeri : " + c);

        System.out.println("son toplam : " + (a+b+c));





    }
}
