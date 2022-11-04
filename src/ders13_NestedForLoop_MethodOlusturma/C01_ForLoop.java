package ders13_NestedForLoop_MethodOlusturma;

public class C01_ForLoop {

    public static void main(String[] args) {

         // kullanicidan bir string isteyin ve stringi tersten yazdirin


        String input= "Java ne kadar guzel";

        for (int i = input.length()-1; i >=0 ; i--) {

            System.out.print(input.charAt(i));

        }


      }

    }

