package ders13_NestedForLoop_MethodOlusturma;

public class C07_MethodOlusturma {

    public static void main(String[] args) {

         String str = "Java muhtesemdir";
         // mEtni buyuk harfe cevirin

        String buyukStr= str.toUpperCase();

        System.out.println(str); // Java muhtesemdir

        System.out.println(buyukStr); // JAVA MUHTESEMDIR

        // metnin buyuk harfe cevrilmis hali 's' icerir mi ?

        System.out.println(buyukStr.contains("s")); // false

        System.out.println(buyukStr.contains("S")); //TRUE
    }







}