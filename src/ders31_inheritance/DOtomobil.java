package ders31_inheritance;

public class DOtomobil extends BinekArac{
    public static void main(String[] args) {
        DOtomobil oto1= new DOtomobil();
        System.out.println(oto1.marka);

        // inheritance sayesinde bir child clas olusturdumuzda
        // yeni hicbir veriable veya method olusturmadan
        // parent classlardaki tum ozellikleri almis oluruz
        // uptade edebilir veya yeni ozellikler ekleyebiliriz

    }
}
