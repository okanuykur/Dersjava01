package ders37_exceptions;

import java.util.Scanner;

public class c04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas<=0){
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                System.out.println("yas sisifr veya negaTIF OLAMAZ");
            }


        }

    }
}
