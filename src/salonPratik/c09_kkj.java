package salonPratik;

public class c09_kkj {

    public static void main(String[] args) {


        int [] arr2= {3,4,5,6};

        System.out.println(arr2[3]);

        arr2[2]=78;

        System.out.println(arr2[2]);

        arr2[1]=90;

        System.out.println(arr2[1]);

        System.out.println(arr2.length);

        System.out.println(arr2[arr2.length - 1]);


        System.out.println(arr2[1] + arr2[2]);

        // arrayin tum elementleri yazdirin

        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i]+ " ");
        }

        }
    }

