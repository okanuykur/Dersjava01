package salonPratik;

public class mdoenuzunkelime {

    public static void main(String[] args) {

        String [] [] arr= {{"ALI"} , {"VELI"}, {"OZAN"} ,{"ALI OSMAN"}};

           String enuzznkl= arr [0] [0];

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (enuzznkl.length()<arr[i][j].length());

                enuzznkl=arr[i][j];
            }
        }

        System.out.println(" en uzun kelime : " + enuzznkl);
    }



}
