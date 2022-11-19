package ders37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_CheckedExceptions {

    public static void main(String[] args) throws IOException {

        String dosyaYolu= "src/ders36_checkedExpection/Deneme.txt";
        int k=0;


        try {

            FileInputStream fis = new FileInputStream(dosyaYolu);
            while ((k=fis.read())!=-1){
                System.out.println((char) k);
            }

        } catch (FileNotFoundException e) {

            System.out.println("dosya yolu yanlis veya dosya arizali");

        }
        /*
        Bir kod calisirken birden fazla exception olusma ihtimali varsa
bu kodu calisir hale getirmek icin 4 ihtimal vardir

1- herbir exception ic ice try-catch bloklari kullanmak
2- Bir tane try blogu birden fazla catch blogu olusturmak
3- method signature'na tum exception ihtimallerini yazmak (exceptions handle edilmis olmaz)
4- eger muhtemel exceptiopn'larin tumunu kapsayan, daha genis kapsamli bir exception varsa
   onu kullanmak
    /* Bir kod calışırken birden fazla exception oluşma ihtimali varsa
        bu kodun çalışır hale getirmek için dört ihtimal vardır

        1- Her bir exception için iç iç TRY CATCH blokları kullanmak
        2- 1 tane TRY blogu birden fazla CATCH blogu olusturmak
        3- Method sıgnature'a tum exception ihtimallerini yazmak(exception handle edılmıs olmaz

        4- Eger Muhtemel exception'ların tümünü kapsayan daha geniş kapsamlı
        bir exception varsa onu kullanmak
         */

        /* 2. ve 3. ıhtımallerde olusması muhtemel exception'lar arasında parent-chıld
        ilişkisi olup olmadıgı kontrol edilmelidir.
        aralarında parent chıld ilişkisi yoksa exceptionları istediğimiz sırada yazabiliriz

        ANCAK parent chıld ilişkisi varsa önce chıld sonra Parent yazılmalıdır.
        AKSİ TAKDİRDE parent daha kapsamlı oldugundan tum exceptionları yakalar ve
        aşagıdakı chıld exception işlevsiz kalır java bu durumu kabul etmez . CTE verir
         */


    }
}
