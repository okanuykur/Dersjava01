package ders33_inheritanceDataTypeKullanimi_overriding;

public class Corolla extends BToyota{

    String model= "corolla";
    String uretimYeri= "turkiye";
    int yil= 2023;

    public static void main(String[] args) {
        // bir obje olusturulurken data turu ve constructor
        //ayni classdan ise yani  Corolla corolla1= new Corolla(); ise
        // bir VERIABLE nin degerini bulmak icin
        // o classa gideriz
        // o classda yok ise sirasiyla parent classlara bakilir

        Corolla corolla1= new Corolla();
        System.out.println(corolla1.model);// Corolla
        System.out.println(corolla1.uretimYeri);// Corolla
        System.out.println(corolla1.yil);//Corolla
        System.out.println(corolla1.marka);//BToyota
        System.out.println(corolla1.motor);//Araba
        System.out.println(corolla1.plaka);//Araba
        System.out.println(corolla1.yakit);// BToyota
        BToyota corolla2=new Corolla();
        /*
        obje olusturulurken data turu ve constroctur farkli ise
        VARIABLE in degerini bulmak icin
        data turu olan classa gidilir varsa kullanilir,
        yoksa o classin parentlerine bakilir
        bulunmazsa CTE verilir
        (amma geri vites yapilmaz)
         */

        System.out.println(corolla2.model);// BToyota
       // System.out.println(corolla2.uretimYeri);// CTE
        System.out.println(corolla2.yil);//BToyota
        System.out.println(corolla2.marka);//BToyota
        System.out.println(corolla2.motor);//Araba
        System.out.println(corolla2.plaka);//Araba
        System.out.println(corolla2.yakit);// BToyota

        Araba corolla3=new Corolla();

        //System.out.println(corolla3.model);// CTE
        //System.out.println(corolla3.uretimYeri);// CTE
        //System.out.println(corolla3.yil);//CTE
        //System.out.println(corolla3.marka);//CTE
        System.out.println(corolla3.motor);//Araba
        System.out.println(corolla3.plaka);//Araba
        System.out.println(corolla3.yakit);// Araba

        BToyota toyota1= new BToyota();
        System.out.println(toyota1.marka);//BToyota
        System.out.println(toyota1.model);//BToyota
        System.out.println(toyota1.motor);//Araba
        System.out.println(toyota1.plaka);//Araba
        System.out.println(toyota1.yil);//BToyota
        System.out.println(toyota1.yakit);//BToyota

        Araba toyota2= new BToyota();
       //System.out.println(toyota2.marka);//CTE
        //System.out.println(toyota2.model);//CTE
        System.out.println(toyota2.motor);//Araba
        System.out.println(toyota2.plaka);//Araba
        //System.out.println(toyota2.yil);//CTE
        System.out.println(toyota2.yakit);//Araba

        Araba araba1 = new Araba();

       // System.out.println(araba1.marka);//CTE
       // System.out.println(araba1.model);//CTE
        System.out.println(araba1.motor);//Araba
        System.out.println(araba1.plaka);//Araba
        //System.out.println(araba1.yil);//CTE
        System.out.println(araba1.yakit);//BToyota






    }

}
