package ders25_staticKeyword;

public class BLiseRunner {

    public static void main(String[] args) {

        BLise lisem1 = new BLise();

        lisem1.hizmetliIsmi="suleyman kaya";
        lisem1.hizmetliAdres="cilek mahallesi";
        lisem1.hizmetliTelefon="22134356";

        System.out.println("yeni lise : " +lisem1);

        BLise lisem2 = new BLise();

        lisem2.hizmetliIsmi="cahit";
        lisem2.hizmetliAdres="cilek mahallesi";
        lisem2.hizmetliTelefon="22134356";

        System.out.println("yeni lise :" +lisem2);

        BLise lisem3= new BLise();
        lisem3.hizmetliIsmi="kemal";
        lisem3.hizmetliAdres="karaduvar mahallesi";
        lisem3.hizmetliTelefon="22134356";
        lisem3.liseMuduru="akin";

        System.out.println("yeni lise : " + lisem3);
        System.out.println("lisem 1 : " +lisem1);












    }
}
