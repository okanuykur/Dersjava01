package ders32_inheritanceConstructorCall;

public class Corolla extends BToyota{

    Corolla (int pc){
        super(5);
        System.out.println("parametreli corolla constroctur");

    }

    Corolla (){

    }
    Corolla(String str){
        this();
        System.out.println("string parametreli corolla");

    }

    public static void main(String[] args) {

        Corolla corolla3= new Corolla("ilker");

        System.out.println("********");

        Corolla corolla1 = new Corolla();

        System.out.println("***********");

        Corolla corolla2= new Corolla(3);



    }
}
