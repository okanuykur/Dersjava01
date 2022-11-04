package salonPratik;

public class Opel {



    String marka = "renault";

    String model = "clio";

    String yakit= "lpg";

    int yil = 2002;

    int fiyat= 35000;

    @Override
    public String toString() {
        return "Opel{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakit='" + yakit + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }

    public Opel (String mrk, String mdl, String ykt, int yl, int fyt){
        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;
    }

    public Opel(){

    }


}
