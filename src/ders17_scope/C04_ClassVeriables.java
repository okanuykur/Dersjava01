package ders17_scope;

public class C04_ClassVeriables {

    public static void main(String[] args) {

        // C3 deki hastane ismini yazzdirmak istiyorum

        System.out.println(C03_ObjectVeriables.hastaneIsmi); // YILDIZ HATANESI

        System.out.println(C03_ObjectVeriables.hastaSayisi); // 23453

        C03_ObjectVeriables.hastaSayisi++;
        C03_ObjectVeriables.hastaSayisi++;
        method1();

        System.out.println(C03_ObjectVeriables.hastaSayisi);

    }

    // kod takibi main methoddan baslar main methodun sonuna gelindiginde hersey biter
    // tum degisimler resetlenir
    // veriable degerleri bastaki hallerine doner

    public static void method1(){

        C03_ObjectVeriables.hastaSayisi++;
    }

}
