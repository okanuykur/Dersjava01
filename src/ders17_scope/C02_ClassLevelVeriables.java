package ders17_scope;

public class C02_ClassLevelVeriables {
    // clss level  verables methodlarin disinda olusturulur
    // genel kullanim en ustte olusturulmalidir

    static String hastaneIsmi= "Yildiz hastanei";
    static  int hastaSayisi= 23453;
    static  String basHekimIsmi ;
    String personelIsmi = " isim girilmedi";
    String personelTelefonu = "telefon girilmedi";
    int personelYasi;



    public static void main(String[] args) {

        System.out.println(hastaneIsmi); // yildiz hastanesi
        System.out.println(basHekimIsmi); //  null
        //System.out.println(personelIsmi); // static olmadigi icin main methoddan kullanilamaz


        // Class level veriabler'a deger atamasi yapilmamis olursa java bu veriable lere
        // data turune gore default olarak tanimlanan degerleri atar
        // default degerler: integer ya da sayisal veriableler icin : 0
        // boolean icin : false
        // char icin = "
        // objeler icin (string dahil) = null


    }
    public static void method1 (){

        System.out.println(hastaSayisi); // cagirabilirz
        hastaSayisi++; // cagirabilirz
        //System.out.println(personelIsmi);// static bir alanda ctatic olmayan level kullanilamaz

    }

    public void method2 (){

        System.out.println(hastaneIsmi); // yildiz hastenesi
        hastaSayisi++;
        System.out.println(personelIsmi); // isim girilmedi

        System.out.println(personelYasi); // 0


    }
}
