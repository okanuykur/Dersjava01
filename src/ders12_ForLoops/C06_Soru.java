package ders12_ForLoops;

public class C06_Soru {

    public static void main(String[] args) {
        //  kullanicidan string isteyin ve terrsten yazdirin


        String input= "Java ne kadar guzel";

        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(input.charAt(i));

        }



    }
}
