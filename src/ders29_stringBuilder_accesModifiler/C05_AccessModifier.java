package ders29_stringBuilder_accesModifiler;

public class C05_AccessModifier {

    public static void main(String[] args) {


        C04_AccessModifier obj= new C04_AccessModifier();

        obj.isim="tugay";
        System.out.println(obj.isim); //tugay

        C04_AccessModifier obj2=new C04_AccessModifier();

        System.out.println(obj2.isim); // Ali

    }
}
