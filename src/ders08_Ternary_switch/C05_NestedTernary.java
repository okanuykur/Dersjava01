package ders08_Ternary_switch;

public class C05_NestedTernary {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi alin
        // sayi pozitifse cift veya tek sayi seceneklerinden uygun olani yaZdirin
        // sayi pozitif degilse 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

        int sayi = 20;

        if (sayi>0){
            System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");

        } else {
            System.out.println(sayi<-99 && sayi>-1000 ? "uc basamakli" : " uc basamakli degil");
        }
          String sonuc = sayi>0 ?
                  sayi%2==0 ? "cift sayi" : "tek sayi"
                  :
                  sayi<-99 && sayi>-1000 ? "uc basamakli" : "uc basamakli degil";




        }

    }

