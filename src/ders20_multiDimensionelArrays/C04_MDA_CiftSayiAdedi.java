package ders20_multiDimensionelArrays;

public class C04_MDA_CiftSayiAdedi {

    public static void main(String[] args) {

        // verilen iki katli bir integer arraydeki sayi adedini bulan kod yazin

        int[][] arr= {{4,6},{3,5,8},{1,0,4}};
        int sayac= 0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j]%2==0){

                    sayac++;
                }

            }



        }

        System.out.println("arraydeki cift sayi adedi : " + sayac); //arraydeki cift sayi adedi : 5






    }
}
