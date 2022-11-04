package salonPratik;

public class mdasoru {

    public static void main(String[] args) {


        int [] [] arr= {{89, 45}, {64,23} , {12,34}};

        toplsonelmnt(arr);


    }

    public static void toplsonelmnt (int [] [] arr){

        int tpla= 0;

        for (int i = 0; i <arr.length ; i++) {

            tpla += arr[i][(arr[i].length-1)];

        }

        System.out.println( " son elemntentleri toplami : " + tpla);
    }
}
