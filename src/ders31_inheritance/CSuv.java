package ders31_inheritance;

public class CSuv extends BinekArac{
    public static void main(String[] args) {
        CSuv suv1 = new CSuv();
        System.out.println(suv1.marka);//binek araclarin markasi olur
        System.out.println(suv1.model);//binek araclarin modeli olur
        System.out.println(suv1.motor);//Tum araclar motor kullanir
        System.out.println(suv1.plaka);//tum araclarin bir plakasi olur
        System.out.println(suv1.yakit);//Araclar farkli yakitlar kullanir
        System.out.println(suv1.yil);//1900
        suv1.hiz();//binek araclarin hizi modele gore degisir
        suv1.teker();//binek araclari 4 tekeri olur

        CSuv suv2 = new CSuv();

        suv2.marka="toyota";
        suv2.model="hrv";
        suv2.motor="1.6";
        suv2.plaka="23yu87";
        suv2.yakit="benzin";
        suv2.yil=2012;
        System.out.println(suv2.marka);
        System.out.println(suv2.model);
        System.out.println(suv2.motor);
        System.out.println(suv2.plaka);
        System.out.println(suv2.yakit);
        System.out.println(suv2.yil);
        suv2.hiz(suv2.yakit);


    }
    public void hiz(String yakit){
        if (yakit.equalsIgnoreCase("benzin")){
            System.out.println("benzinli suvler max 240 km yapar");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("dizel suv lar max 200 km yapar");

        } else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("hibrit suv ler max 260 km yapar");


        }else {
            System.out.println("yakit belli degil");
        }
    }


}
