package praktickAyseHoca;

import java.util.Random;
import java.util.Scanner;

public class Q1_TasKagitMakas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int userChoice = 0;
        int cmpChoice = 0;
        int user = 0;
        int comp = 0;

        do {


            System.out.println("please make your choise  :\n\t1 for rock\n\t2 for paper\n\t3 for scissors");
            userChoice = scan.nextInt();

            cmpChoice = random.nextInt(3) + 1;

            if (userChoice==1 && cmpChoice==2) {
                System.out.println("paper covers  rock  ===> computer +1 ");

                comp++;
                System.out.println("user = " + user + " | computer = " + comp);



            }





    }while(user !=5&&comp !=5);{



            if (user > comp) System.out.println("you are the winner!!");

            else System.out.println("sory you are loser :(");






        }



    }




}
