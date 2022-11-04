package ders17_scope;

public class C01_LocalVeriable {

    public static void main(String[] args) {
        // bir methodun icerisinde olustsurulan variable larin scope u
        // icinde olusturulduklari methoddur
        // o method disindan ulasilamazlar

        int sayi = 10;
        String isim = "Ramazan";

       // System.out.println(dogruMu);

        for (int i = 0; i <10 ; i++) {

            String adres= "ankara";

            // bir loop icerisinde olusturulan veriable lar sadece o loop icerisinde gecerlidir



        }


       // System.out.println(adres);

        double pi ;

        //System.out.println(pi);
        // local veriable lar deger atamadan olusturulabilir ancak kullanilamazlar
        // kullanmdan once deger atmis olmaliyiz


    }

    public static void method1(){
       // System.out.println();

        //isim="tugay";

        boolean dogruMu= true;
    }
}
