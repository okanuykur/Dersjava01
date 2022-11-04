package ders10_StringManipulations;

public class C06_indexOf {
    public static void main(String[] args) {

      // indexOf methodu bizim ister char ister string olark verdigimiz degerin indexini verir

        String str = "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); // 9 yani ilk a nin indexini verdi
        System.out.println(str.indexOf('c')); // 8 yani ilk c nin degerini verdi
        System.out.println(str.indexOf("hersey")); // 15 hersey 15. index ile basladi

        // birde indexOf un str:,fromindex kismi var ; o da fromndexe yazilam rakamdan baslayarak
        // bulunmasini istedginiz karakterin index numarasini verir

        System.out.println(str.indexOf("e",9)); // 9. indexten baslayarak ilk e nin kacinci
        // indexte oldugunu verir 13

        // soru = cumledeki ikinci c nin indexini yazdirin

        // once int methodu ile ilk c yi bulalim

        int ilkcindex = str.indexOf("c"); //

        System.out.println(str.indexOf("e", ilkcindex+1)); // 22


    }
}
