package ders08_Ternary_switch;

import java.util.Scanner;

public class C09_KendiDenemem {
    public static void main(String[] args) {

        /*
         Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
         ve girilen harfin karsiligini yazdirin.
         I : International S : Software T : Testing Q : Qualifications B: Board
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir harf girin");

        char harf = scan.next().charAt(0);

         switch (harf) {
             case 'i' :
             case 'I' :
                 System.out.println("International");
                 break;
             case 's' :
             case 'S' :
                 System.out.println("Software ");
                 break;
             case 't' :
             case 'T' :
                 System.out.println("Testing");
                 break;
             case 'q' :
             case 'Q' :
                 System.out.println("Qualifications ");
                 break;
             case 'b' :
             case 'B' :
                 System.out.println("Board");
                 break;
             default:
                 System.out.println("geceersiz harf");
        }


    }
}
