package ders38_AbstractClasses;

public abstract class CParentAbstractClass {

    public abstract void mecburiMethod1();

    public abstract void mecburimeMethod2();
    // soyut )abstrcat )methdolarin bodysi olmaz

    public String concreteMethod(){

        // bugune kadar kullandigimiz normal methodlara
        // soyut olmayan method demek yerine
        // conrete method denir

        return "";

    }

    // bir parent clasda child claslarin mutlaka overrdie edecegi bir method olusturdugumuzda
    // method bodysi gereksizlesir
    // cunku hic calismayacaktir

    // 1- abstract parent classdan obje olusturulamayacgi icin
    // objeler icin bu method kullanilamaz
    // 2- child classlarda mecburen override edeceklerinden
    // bu methodlarin bodysi asla kullanilmayacaklarir
    // java hic kullananilmayacak method body leri yazmamiza imkan tanimistir
    // child classlarin mutlaka override etmesini istedigimiz methodlari
    // abstract olarak tanimlar ve bodys siz olarak olustururuz,
}
