package btkJava;

public class btk_03Classes {
    public static void main(String[] args) {
        String mesaj ="bugun hava cok guzel";
        String yeniMesaj=mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int sayi= topla(5,7);
        System.out.println(sayi);
        int toplam=topla2();
        System.out.println(toplam);

    }

    public static void ekle(){
        System.out.println("eklendi");

    }
    public static void sil(){
        System.out.println("silndi");

    }
    public static void guncelle(){
        System.out.println("guncellendi");

    }

    public static int topla(int sayi , int sayi2){
        return sayi+sayi2;


    }

    public static int topla2(int... sayilar){
        int toplam=0;

        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;

    }
    public static String sehirVer(){
       return "ankara";
    }
}
