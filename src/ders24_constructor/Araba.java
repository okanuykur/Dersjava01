package ders24_constructor;

public class Araba {


    public Araba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil   =  yil;
        this.fiyat = fiyat;
    }

    String marka = "marka belirtilmedi";
        String model = "model belirtilmedi";
        String yakit ;
        int yil;
        int fiyat ;




    public  Araba(String mrk, String mdl){

            marka=mrk;
            model=mdl;

        }


    public Araba(String marka, String model,  int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public Araba (){


        }


    public String toString() {

        return "araba ozellikleri" +
                "\n marka : " + marka +
                "\n model : " + model +
                "\n yakit : " + yakit +
                "\n yil   : " +  yil   +
                "\n fiyat : " + fiyat ;

    }



}
