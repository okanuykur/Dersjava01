package ders06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {

        // kullanicidan bir ucgenin 3 kenar uzunluklarini alin
        // ucgen eger eskenar ise "Eskenar ucgen" yazdirin degilse "Eskenar degil" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc kenari girin");

        int kenar1= scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();


        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");

        } else {
            System.out.println("Eskenar ucgen degil");
        }

    }
}
