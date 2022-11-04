package ders17_scope;

import java.util.Scanner;

public class C05_ObjectVeiables {

    public static void main(String[] args) {
        // C03 classindaki instace veriablelere nasil ulasabiliriz

        // instace veriablelerin diger adi obje veriablesidir
        // instace veriablelere obje uzerinden ulasabiliriz

        Scanner scan = new Scanner(System.in);

        C03_ObjectVeriables pers1 = new C03_ObjectVeriables();
        System.out.println(pers1.personelIsmi); //isim girilmedi
        System.out.println(pers1.personelYasi); // 0

        pers1.personelIsmi="suleyman";
        pers1.personelYasi=35;
        pers1.personelTelefonu="444 5555.678";

        System.out.println(pers1.personelIsmi);
        System.out.println(pers1.personelYasi);

        C03_ObjectVeriables pers2 = new C03_ObjectVeriables();

        pers2.personelIsmi= " latif";
        pers2.personelYasi=45;
        pers2.personelTelefonu= "984748883";

        System.out.println(pers1.personelIsmi); // suleyman
        System.out.println(pers2.personelIsmi); // latif

        C03_ObjectVeriables pers3 = new C03_ObjectVeriables();

        pers3.personelIsmi= "heysem";
        pers3.personelYasi = 30;
        pers3.personelTelefonu= "65883749";

        System.out.println(pers1.personelYasi);// 35
        System.out.println(pers3.personelYasi); // 30
        System.out.println(pers2.personelYasi); // 45
    }
}
