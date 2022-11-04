package ders18_arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        int [] arr1= {2,4,6,8,10};

        // arrayin bir elementine ulasmak ve uptade etmek istersek

        System.out.println(arr1[2]); // 6

        arr1[3]=20; // 8 i 20 yapti


        System.out.println(arr1[3]); // 20 atiyor

        System.out.println(arr1.length); //5

        // son element

        System.out.println(arr1[arr1.length-1]); // 10

        // arrayin tum elementlerini yazdirin

        for (int i = 0; i <arr1.length ; i++) {

            System.out.print(arr1[i] + " "); // 2 4 6 20 10


            // arrayin uzunlgu sonradan degistirilemez
            //eger array de olmayan bir indexe atama yapsak java hata verir
            // bu hata cte degil
            // run time error dur


           // arr1[5]= 35;


        }

    }
}
