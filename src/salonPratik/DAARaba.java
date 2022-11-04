package salonPratik;

public class DAARaba {

    @Override
    public String toString() {
        return "DAARaba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakit='" + yakit + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }

    String marka = " marka belirtilmedi";
    String model = "model belirtilmedi";
    String yakit;
    int yil; ;
    int fiyat ;

    public int maxhiz(String yskit){

        int maxhiz=120;
        if (yakit.equalsIgnoreCase("dizel")){
            maxhiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxhiz=230;

        } else if (yakit.equalsIgnoreCase("elektirikli")) {
            maxhiz=180;

        }
        return maxhiz;

    }




}
