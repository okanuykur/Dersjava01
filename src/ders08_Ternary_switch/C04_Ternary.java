package ders08_Ternary_switch;

public class C04_Ternary {
    public static void main(String[] args) {


        // kullanicidan ucgenin 3 kenar uzunlugunu alin
        // ucgen eskenar ise "eskenar ucgen" yazdirin
        // degilse eskenar degil yazdurin

        int kenar1= 15;
        int kenar2 = 30;
        int kenar3 = 50;

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "eskenar ucgen" : " eskenar ucgen degil");

        // kullanicidan iki sayi alin ve buyuk olmayani yazdirin

        int sayi1 = 50;
        int sayi2= 60;
        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);


    }
}
