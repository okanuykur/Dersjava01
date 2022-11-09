package ders32_inheritanceConstructorCall;

public class BToyota extends Araba {

    BToyota(){
        System.out.println("parametresiz toyota constroctur");
    }

    BToyota(int Pt){
        System.out.println("parametreli toyota cons");

    }
    BToyota(String pt2){
        super("mehmet");
        System.out.println("string parametreli toyota");
    }

}