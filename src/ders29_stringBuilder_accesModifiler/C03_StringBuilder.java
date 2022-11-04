package ders29_stringBuilder_accesModifiler;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java ne kadar guzel");

        System.out.println(sb.substring(4));// ne kadar guzel
        System.out.println(sb);//Java ne kadar guzel

       // sb=sb.substring(0,4) esitligin sonu StringBuilder, sagi ise String
        //                             Java non-primitive datalarda casting yapmaz

        // Ayni not Integer Byte ve short gibi sayi baridnriran no-primitaviler icin de gecerlidir

        /*
        StringBuilder da olmayan,  classinda bulunan methodlari kullanmak isterseniz;
        once toStringe cevirip , sonra String manipulation yapabilirsiniz

         */

        System.out.println(sb.toString().contains("guzel")); //true
        sb.setCharAt(5,'N');
        System.out.println(sb);

    }
}
