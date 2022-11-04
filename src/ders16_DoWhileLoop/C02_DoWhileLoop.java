package ders16_DoWhileLoop;

public class C02_DoWhileLoop {

    public static void main(String[] args) {

        // 10 11 12 sayilarini toplayan bir do whileloop olusturalim

        int sayi = 10;

        int toplam = 0;


        do {
            toplam+=toplam+sayi;

            sayi++;

            System.out.println(toplam);

        } while (sayi<=12);




        // do while loop un su avantaji vardir
        // 1 loop bodysi en az bir kere calisir
        // (while loop da baslangic degeri uygun degilse loop bodysi hic calismayabilir


    }

}
