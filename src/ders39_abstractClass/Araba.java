package ders39_abstractClass;

public abstract class Araba {
    // araba classini inheri eden tum classlar
    // motor,marka,kasa,tekerlek methodlarini override etmek zorunda kalsin
    // ancak abs, klima methodlaro opsiyonel olsun
    // isteyen child bu methodlari override etsin isteyen etmesin

    public abstract void motor();

    public abstract void marka();


    public abstract void kasa();



    public abstract void tekerlek();

    public void abs(){
        System.out.println("guvenligi arttirmak isteyen arabalar abs kullanmali");
    }
    public void klima(){
        System.out.println("konfor arttirmak isteyen arabalar klima kullanmali");
    }


}
