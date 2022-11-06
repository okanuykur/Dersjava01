package ders30_encapsulation;

public class C01_Encapsulations {

    public static void main(String[] args) {
        AEncapsuleClass pers1= new AEncapsuleClass();

        pers1.hemsireIsmi="yildiz yildiz";
        pers1.hemsireAdresi="ankara";
        System.out.println(pers1.getHastaneIsmi());
        pers1.setHastaUcreti(800);

    }
}
