package ders06_IfElseStatements;

public class C09_IfElseStatements {
    public static void main(String[] args) {

        // kullanicidan bir tam sayi alin
        // eger negatif ise "gecersiz sayi" yazdirin
        // tek basamakli ise "rakam"
        // iki basamakli ise "iki basamakli"
        // bunun disindaki sayilar icin "buyuk sayi" yazdirin

        int sayi = 170;

        if (sayi<0){
            System.out.println("gecersiz sayi");
        } else if (sayi<10) {
            System.out.println("rakam");

        } else if (sayi<100) {
            System.out.println("iki basamakli sayi");

        } else {
            System.out.println( "buyuk sayi");
        }


    }
}
