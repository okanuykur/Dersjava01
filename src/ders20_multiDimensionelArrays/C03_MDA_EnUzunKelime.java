package ders20_multiDimensionelArrays;

public class C03_MDA_EnUzunKelime {
    public static void main(String[] args) {
        // verilen multi diemensionel strin bir arraydeki
        // en uzun stringi bulan kod yazin

        String [] [] arr= {{"ilker" , "nesrin"} ,{ "hasan", "heysem" , "adem" , "yusuf enes"}};

        String enUzunKelime=arr[0][0];


        for (int i = 0; i <arr.length ; i++) { // outher arraryin elemanlari kontrol edelim

            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j].length()>enUzunKelime.length()){
                    enUzunKelime=arr[i][j];
                }


            }

        }

        System.out.println("en uzun kelime : " + enUzunKelime);//en uzun kelime : yusuf enes

    }
}
