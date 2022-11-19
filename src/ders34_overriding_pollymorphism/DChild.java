package ders34_overriding_pollymorphism;

public class DChild extends CParent{

    // overriding kurallari
    // 1- acces modifer method signature dahil olmadigindan
    // overriden ve overriding acces modofierlar farkli olabilir
    // child parenti sinirlandirmaz
    // yani overriding methodun acces modifieri daha genis kapsamli olmalidir
    // private --default--protected--public

    public void method1(){
     // 2. private ve static methodlar override edilemez
        // ayni isimde olusturulunca java cte vermez ancak
        // override isareti cikmaz ve
        //@override . notasyonu kullanilmak istenirse cte olur
        // yani java bunlari farli claslardaki farkli methodlar olarak algilar
    }

    @Override
    protected void method2() {
        super.method2();

    }

    // 3- return type method signature dahil olmadigindan
    // farkli secilebilir
    // return type void veya primitave ise ayni olmak zorundadir

    public void method4(){



    }
    public String method5(){
        return "";

    }
}
