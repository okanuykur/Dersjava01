package ders30_encapsulation;

public class AEncapsuleClass {

    private  String hastaneIsmi="Yildiz Hastanesi";

    public void setHastaUcreti(int hastaUcreti) {
        this.hastaUcreti = hastaUcreti;
    }

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }

    // hastane ismi gorulebilsin ama degistirilemesin
    // getter methodu lazim
    private int  hastaUcreti;
    // hasta ucretleri de giris yapilabilsin ama
    // ucreti sigortadan oldugu icin
    // personel hasta ucretlerini goremesin
   // setter methodu lazim
    String hemsireIsmi;
    String hemsireAdresi;

    // bu instace veriable lere herkes ulasabilsin
    // bu durumda public yapmak ilk akla gelen cozum olacaktir





}
