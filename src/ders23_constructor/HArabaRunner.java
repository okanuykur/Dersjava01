package ders23_constructor;

public class HArabaRunner {

    public static void main(String[] args) {
        HAraba arb1= new HAraba();

        arb1.marka="toyota";
        arb1.model="corolla";
        arb1.yakit="dizel";
        arb1.yil=2010;
        arb1.fiyat=12000;

        System.out.println(arb1);

        HAraba arb2= new HAraba("honda","civik","benzin",2011,11000);

        System.out.println(arb2);

        HAraba arb3= new HAraba("opel","corsa","dizel",2013,10000);
        System.out.println(arb3);

        HAraba arb4= new HAraba("tesla","x",2010);
        System.out.println(arb4);
    }
}
