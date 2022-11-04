package salonPratik;

public class mdaciftsayiadedi {

    public static void main(String[] args) {


        int [] [] arr = {{2,4,5,7,9}};

        int sayac = 0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {


                if (arr[i][j] %2 ==0){
                    sayac++;
                }
            }

        }
        System.out.println(sayac);
    }
}







