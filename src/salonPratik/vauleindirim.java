package salonPratik;

public class vauleindirim {

    public static void main(String[] args) {

        double fiyat = 355;


        System.out.println(indirimfiyati(fiyat));

    }

    public static double indirimfiyati (double fiyat ){

        fiyat=fiyat*0.7;
        return fiyat;
    }


}
