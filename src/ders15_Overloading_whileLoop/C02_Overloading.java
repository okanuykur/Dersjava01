package ders15_Overloading_whileLoop;

public class C02_Overloading {

    public static void main(String[] args) {

    carpim(4.5,60);


}

public static void carpim (int sayi1 , int sayi2){ // carpim int int

    System.out.println("Iki integer sayinin carpimi : " + sayi1*sayi2);

}

public static void carpim (int sayi3 , int sayi4 , int sayi5){ // carpim int int int

    System.out.println("Uc integer sayinin carpimi : " + sayi3*sayi4*sayi5);

}

public static void carpim (double sayi1 , int sayi2){ // carpim dbl int

    System.out.println("double , integer sayinin carpimi : " + sayi1*sayi2);

}

public static void carpim (int sayi1 , double sayi2){ // carpim int double

    System.out.println("int , double sayinin carpimi : " + sayi1*sayi2);

} public static void carpim (double sayi1 , double sayi2 ){

        System.out.println("iki  double sayilarin carpimi : " + sayi1*sayi2);
    }

}