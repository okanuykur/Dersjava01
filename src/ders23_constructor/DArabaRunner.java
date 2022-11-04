package ders23_constructor;

public class DArabaRunner {

    public static void main(String[] args) {
        DAraba arb1=new DAraba();
        System.out.println(arb1.marka); //marka belirtilmedi
        System.out.println(arb1.model); //model belirtilmedi
        System.out.println(arb1.yakit);//null
        System.out.println(arb1.yil);//0
        System.out.println(arb1.fiyat);//0

        arb1.marka="tofas";
        arb1.model="kartal";
        arb1.yakit="benzin";
        arb1.yil=1991;
        arb1.fiyat= 50000;
        arb1.maxHiz(arb1.yakit);

        System.out.println(arb1.marka); // tofas
        System.out.println(arb1.model); //kartal
        System.out.println(arb1.yakit);//benzin
        System.out.println(arb1.yil);//1991
        System.out.println(arb1.fiyat);//50000
        System.out.println(arb1.maxHiz(arb1.yakit)); //120

        DAraba arb2=new DAraba();
        //arb2 nin ozelliklerini yazdirmak istesem

        System.out.println("marka : " + arb2.marka+
                "\nmodel : " +arb2.model+
                "\nyakit : " + arb2.yakit+
                "\nyil : "+ arb2.yil+
                "\nfiyat : "+ arb2.fiyat);

          DAraba arb3= new DAraba();

        System.out.println(arb3);
        System.out.println(arb1);

        DAraba arb4 = new DAraba();
        System.out.println(arb4);


    }

}
