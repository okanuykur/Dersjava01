package ders22_arrayLists;

public class C04_ForEachLoop {

    public static void main(String[] args) {

        int [] arr ={3,5,7,8,4,2,9,6,4,5,};

        // bu arraydeki 5 den buyuk tum elementleri toplayin

             int toplam = 0;
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>5){
                toplam += arr[i];
            }
        }
            System.out.println("for lop ile : " + toplam);

        // for each ile daha vbasittir
        toplam=0;
        for (int  each : arr
        ) {

            if (each>5){
                toplam+=each;
            }

        }

        System.out.println("for-each loop ile toplam : " + toplam);

    }
}
