package salonPratik;

public class YeniAraba {

    String marka = "marka belirtilmedi";
    String model = "model belirtilmedi";
    String yakit ;
    int yil;

    int fiyat;

     public  YeniAraba(String mrk, String mdl){

       marka= mrk;
       model=mdl;

     }

    public YeniAraba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public  YeniAraba (){


     }


    @Override
    public String toString() {
        return "Arabanin ozellikler " +
                "\nmarka : " + marka  +
                "\nmodel : " + model  +
                "\nyakit : " + yakit  +
                "\nyil   : " + yil    +
                "\nfiyat : " + fiyat  ;
    }

    }

