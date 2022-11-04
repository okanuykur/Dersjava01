package ders10_StringManipulations;

public class C08_lasttindexOf {

    public static void main(String[] args) {

       // lastindexof methodu ise bize yazdigimiz karakterin sondan indexini arayarak bulur ve verir
        // ama index her zaman soldan baslar 0 1 2 3..
        String str = "Java hafiften beyin yakiyor";
        System.out.println(str.lastIndexOf("a")); //21
        System.out.println(str.lastIndexOf('e')); // 15
        System.out.println(str.lastIndexOf("java")); // -1 cunku boyle bir karakter yok
        System.out.println(str.lastIndexOf("Java")); //0

        // bir de lastIndexin str,fromindex methodu ile hangi indexten sonra geriye dogru
        // hangi karakterin indexini bulmmamiza yarar

        System.out.println(str.lastIndexOf("e", 14)); //11


    }
}
