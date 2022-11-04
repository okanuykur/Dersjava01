package ders06_IfElseStatements;

public class C10_IfElseStatements {
    public static void main(String[] args) {

        // kullanicidan cinsiyetini ve yasini alin.
        // Kadin 60 yas ve uzeri,
        // Erkek 65 yas ve uzeri ise emekli olabilir yazdirin.
        // Cinsiyet ve yasini dikkate alarak;
        // "Emekli olabilirsin" ya da "Emekli olmak icin ...  Yil daha calisman gerekir"
        // bu souruyu if veya else-if ile cizmelisin

        char cinsiyet = 'E';
        int yas = 63;

        if (cinsiyet=='E' && yas>=65){
            System.out.println("Emekli olabilir");
        } else if (cinsiyet=='E' && yas<65&& yas>15) {
            System.out.println("Emekli olmak icin " + (65-yas) + "Yil daha calisman gerekir");

        } else if (cinsiyet=='K' && yas>=60) {
            System.out.println("Emekli olabilirsin");

        } else if (cinsiyet=='K' && yas<60 && yas>15) {
            System.out.println("Emekli olmak icin " + (60-yas) + "Yil daha calisman gerekir");

        } else {
            System.out.println(" gecersiz giris"); }


    }
}
