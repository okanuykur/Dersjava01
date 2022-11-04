package ders23_constructor;

public class HAraba {


    String marka = "marka belirtilmedi";
    String model = "model belirtilmedi";
    String yakit ;
    int yil;
    int fiyat ;

    public  HAraba(String mrk,String mdl, String ykt, int yl , int fyt){

       marka = mrk;
       model = mdl;
       yakit= ykt;
       yil=yl;
       fiyat=fyt;

    }

    public  HAraba (String mrk,String mdl, int yl){
        marka =mrk;
        model=mdl;
        yil=yl;

    }

    public HAraba(){

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




