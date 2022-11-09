package ders32_inheritanceConstructorCall;

public class FKuslar extends EHayvanlar{

    public static void main(String[] args) {
        CAvciKuslar avci1 = new CAvciKuslar();

        FKuslar avci2= new CAvciKuslar();


        EHayvanlar avci3= new CAvciKuslar();

        /*
        bir child classda obje olusturmak icin
        chil class constructor u kullanilir

        ama data turunu  o objenin bagli oldugu classlardan secebiliriz

        eger constructor ve data turu farkli secilirse
        bu durumda class uyesi olan veriable ve methodlar
        farkli davranislar gosterirler
         */
    }
}
