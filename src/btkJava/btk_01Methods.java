package btkJava;

public class btk_01Methods {


    public static void main(String[] args) {
        int [] sayilar = new  int[] {1,2,5,7,9,0};

        int aranacak =2;
        boolean varMi = false;

        for (int sayi : sayilar){

            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }

        if (varMi){
            System.out.println("sayi mevcuttur");
        }else {
            System.out.println("sayi mevcut degildir");
        }
    }
}
