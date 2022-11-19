package ders39_abstractClass;

public abstract class BHonda extends Araba {

    // abstract bir clasi parent edindigimizde
    // iki alternatif olur
    // 1- parentimiz olan abstract classdaki abstract methodlari override etmek
    // 2- proje yapimiz gerektiriyorsa bu classi da abstract yapmak

    public void marka(){

        System.out.println("marka : honda");
    }

    public abstract void  yakit();

    public abstract void  guvenlik();

    public void ozelTeknoloji(){

        System.out.println("tum honda arabalar vtec teknolojisi kullanir");
    }

}
