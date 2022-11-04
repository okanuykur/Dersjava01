package salonPratik;

public class DAARabaRunner {

    public static void main(String[] args) {

        DAARaba arb1 = new DAARaba();

        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yil);
        System.out.println(arb1.fiyat);
        System.out.println(arb1.maxhiz(arb1.yakit));

        arb1.marka="tofas";
        arb1.model= "sahin";
        arb1.yil=2000;
        arb1.fiyat=33000;
        arb1.maxhiz(arb1.yakit);

        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yil);
        System.out.println(arb1.fiyat);
        System.out.println(arb1.maxhiz(arb1.yakit));

        DAARaba arb2= new DAARaba();

        System.out.println(arb2);


    }

}
