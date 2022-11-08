package ders30_encapsulation;

public class EChild extends  DParent{
    /*
    javadaki inheritance nin insanlrdan en buyuk farki;
    insanlarda parent child edinebilir ama child parent edinemez

    java da ise tam tersidir
    - siz bir class olusturdugunuzda daha once olusturmus oldugunuz classlardan
    tum ozelliklerini inherit etmek istediginiz classi PARENT EDINIRSINIZ

    Bir class baska b ir classi inherit etmek istediginde
    extends keyword ile bunu deklare eder

     */

    public static void main(String[] args) {
        EChild child1=new EChild();

        child1.yas=30;
        child1.isim="mahmut";
        child1.isEnough=false;
    }
}
