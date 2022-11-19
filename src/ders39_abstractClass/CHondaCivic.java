package ders39_abstractClass;

public class CHondaCivic extends BHonda{
    @Override
    public void motor() {
        System.out.println("honda civi araclar vtec cevreci motor kullanir");
    }

    @Override
    public void kasa() {
        System.out.println("civic sedan veya hp kasa kullanir");

    }

    @Override
    public void tekerlek() {
        System.out.println("civic araclar 205*16*55 tekerlek kullanir");

    }

    @Override
    public void yakit() {
        System.out.println("civc araclar benzinlidir");

    }

    @Override
    public void guvenlik() {

        System.out.println("civic araclar guvenlidir");

    }

    @Override
    public void abs() {
        System.out.println("honda arabalar standart abs ye sahiptirler");
    }

    @Override
    public void klima() {
        System.out.println("honda arabalar standart klima kullanirlar");
    }

    public static void main(String[] args) {

        /*
        abstract parent classlardaki abstract methodlar
        concrete child classlar tarafindan mecburen override edilir

        ancak abstract parentlardaki concrete methodlari
        override etmek mecburi degildir
        .
        eger child classa uyarlamak isterseniz override edebilirsiniz
        veya override etmeyip parent clasindaki haliyle kulanabilirsiniz
         */

        CHondaCivic civi1= new CHondaCivic();
        civi1.abs();// civic
        civi1.klima();//civic
        civi1.marka();//honda
        civi1.ozelTeknoloji();//honda
    }
}
