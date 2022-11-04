package salonPratik;

public class topla {

    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve
        // varsa kac kere kullanildigini yazdiran bir method olusturun.

        int [] arr = {1,2,3,2,4,2,5,2,6};

        int arananEleman= 2;

        elmnAra(arr,arananEleman);




    }

    public static void elmnAra(int[] arr , int arananEleman){

        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]==arananEleman){

                sayac++;



            }

        }

        if (sayac==0){

            System.out.println("aranan eleman array de yoktur");
        } else {
            System.out.println("aranan eleman " + " " + arananEleman + " " + "sayisi arrayde " + " "
            + sayac + " " + " kez kullanilmistir");
        }

    }


}
