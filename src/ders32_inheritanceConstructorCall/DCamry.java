package ders32_inheritanceConstructorCall;

public class DCamry extends BToyota {
    DCamry(String pc){
        super("deniz");
        System.out.println("string parametreli Camry");
    }
    DCamry(){

    }

    public static void main(String[] args) {

        //eger kullanilan argumente  uygun bir constuctor yoksa
        //parent class da cte olur

        DCamry camry2= new DCamry("CELAL");

        System.out.println("*******");
        DCamry camry1= new DCamry();

    }
}
