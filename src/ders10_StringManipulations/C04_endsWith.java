package ders10_StringManipulations;

public class C04_endsWith {
    public static void main(String[] args) {
      // eindsWith methodu ise stringin neyle bittigini sorar

     String str = "Java heryerde guzeldir";

        System.out.println(str.endsWith("guzeldir")); // true
        System.out.println(str.endsWith(""));//true
        System.out.println(str.endsWith("Java heryerde guzeldir"));// true
        System.out.println(str.endsWith("java"));//false
    }
}
