package ders34_overriding_pollymorphism;

public class BChild extends AParent{
    @Override
    public void method3() {
        super.method3();
    }

    public void  method1(){

        System.out.println("child class method");
    }

    public void method2(int a){
        // overriding olabilmesi icin
        // hem method ismi hem de signature ayni olmalidir

        System.out.println("child class method");
    }

    public void method2(String isim){
        System.out.println("child class strimg parametreli method");
    }

}
