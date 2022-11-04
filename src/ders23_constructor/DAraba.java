package ders23_constructor;

public class DAraba {

    // bir proje olusturulurken tum classlarda main method olmasina gerek yoktur
    // cogu class obje olustrulursrak kullanmilmak uzere hazirlanmis depolardir
    //biz bu clasi araba objeleri icin bir depo olarak dizayn edelim


    String marka = "marka belirtilmedi";
    String model = "model belirtilmedi";
    String yakit ;
    int yil;
    int fiyat ;


    public DAraba(String marka) {
        this.marka = marka;
    }

    public DAraba() {
    }

    @Override
    public String toString() {
        return "araba ozellikleri" +
                "\n marka : " + marka +
                "\n model : " + model +
                "\n yakit : " + yakit +
                "\n yil   : " +  yil   +
                "\n fiyat : " + fiyat ;

    }

    public int maxHiz(String yakit){

        int maxHiz=120;


        if (yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("dizel")) {
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektirikli")) {
            maxHiz=180;
        }

        return maxHiz;
    }




}
