package ders25_staticKeyword;

public class AHemsire {

    static  String hastaneIsmi = "yildiz hastanesi";
    static  String hastaneAdresi = "cankaya / ankara";
    static  String bashekimIsmi = " dr mehmet yilmaz";

    String personelIsmi = " isim belirtilmedi";
    String personelAdresi = "adres belirtilmedi";
    String personelTelefon = "telefon belirtilmedi";

    @Override
    public String toString() {
        return "AHemsire{" +
                "personelIsmi='" + personelIsmi + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ",\n hasteneIsmi='" + hastaneIsmi + '\'' +
                ", bashekimIsmi='" + bashekimIsmi + '\'' +
                ", hastaneAdresi='" + hastaneAdresi + '\'' +
                '}';
    }
}







