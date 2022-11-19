package ders36_checkedExpection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("src/ders36_checkedExpection/Deneme.txt");

        FileOutputStream fos= new FileOutputStream("src/ders36_checkedExpection/Deneme.txt");

        // java ile bilgisayarimizdak dosyaya ulasmak istersek
        //  FileInputStream  claasinda obje olusturup
        // o obje araciigiyla dosyayi kullanabilirz

        // fis olusturruken ulasmak istedigimz dosyanin
        // dosya yolunu parametre olarak girmeliyiz

        /*
        check exeption olusturma ihtimali olan kodlari yazdigimizda
        java compile time orada bir hata ihtiali oldugunu gorur
        ve kodun altini kirmizi olarak cizer

        bu durumda kirmizi cizgiyi kaldirmak icin 2 yontem vardir
        1- exeptionu try catch blogu ile handle etmek
        2- javaya sorun ihtimalinin farkinda oldugumuzu ama kodumuza guvendigimizi
        ve calismaya devam etmek istedigimizi soylemek
        bunun icin method signature na
        method deklarasyonu ile curly braces arasina
        thouwrs
         */


    }
}
