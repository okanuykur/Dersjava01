package ders38_AbstractClasses;

public class DChildClassOfAbstractClass extends CParentAbstractClass{


    /*
     Abtract bir classdaki , abstract methodlarin TAMAMI
     concrete child class'lar tarafindan override edilmelidir.
     */


    @Override
    public void mecburiMethod1() {
        System.out.println("child class method icerisinde methodu kendine uyarlar");

    }

    @Override
    public void mecburimeMethod2() {

    }
}
