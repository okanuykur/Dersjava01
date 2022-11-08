package ders31_inheritance;

public class FToyota extends EAraba{
    FToyota(){
        super();
        System.out.println("toyota cons calisti");
    }

    protected  String marka = "toyota";
    protected  String motor= "toyota araclar cevreci motor kullanir";
    protected String uretimYeri = "uretim yeri belirltilemdi";
    protected int hiz= 140;

}
