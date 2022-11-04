package salonPratik;

public class OpelRun {
    public static void main(String[] args) {

        Opel opl1= new Opel();
        opl1.marka="opel";
        opl1.model="astra";
        opl1.fiyat=33333;
        opl1.yil=2022;
        opl1.yakit="benzin";

        System.out.print(opl1);

        Opel opel2 = new Opel("honda","cazz","lpg",2021,3400);
        System.out.println(opel2);


    }
}
