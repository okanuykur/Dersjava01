package ders07_NestedIfElseStatements;

public class C02_IfElseStatements {

    public static void main(String[] args) {

        // kullanicidan aldigi urun adedini alin
        // kullanicidan  liste fiyatini alin
        // kullaniciya musteri karti olup olmadigini sorun
        // musteri karti varsa ve 10 urunde fazla alirsa %20 indirim, yoksa %15 indirim yapin
        // musteri karti yoksa 10 urunden fazla alirsa %15 , 10 urunden az ise %10 indirim yapin
        // musteri karti yoksa 10 urunde fazla alirsa %15, 10 urunden az ise %10 indirim yapin

        int urunAdedi =  30;
        double listeFiyati= 12.5;
        boolean kartVarMi = true;
        double toplamFiyat = 0;

        if (kartVarMi && urunAdedi>=10){

            toplamFiyat= urunAdedi*listeFiyati* (0.8);

            System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat);

        } else if (kartVarMi && urunAdedi<10 && urunAdedi>0) {
            // kart yok yani kartVarMi=false demis olsa idik burdaki kartVarMi sorusunun basina ! koymali idik
            toplamFiyat= urunAdedi*listeFiyati* (0.85);
            System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);

        } else if (kartVarMi && urunAdedi>10) {
            //  kart yok yani kartVarMi=false demis olsa idik burdaki kartVarMi sorusunun basina ! koymali idik
            toplamFiyat= urunAdedi*listeFiyati* (0.85);
            System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);

        } else if (kartVarMi && urunAdedi<10 && urunAdedi>0) {
            toplamFiyat= urunAdedi*listeFiyati* (0.9);
            System.out.println("%10 indirimli toplam fiyat : " + toplamFiyat);


        } else {
            System.out.println("gecersiz giris");
        }


    }
}
