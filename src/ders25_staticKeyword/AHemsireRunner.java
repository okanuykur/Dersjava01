package ders25_staticKeyword;

public class AHemsireRunner {
    public static void main(String[] args) {

        AHemsire h1= new AHemsire();
       h1.personelIsmi= "ayse";
       h1.personelAdresi="ulus";
       h1.personelTelefon="5758494845";

        System.out.println(h1);

        AHemsire h2= new AHemsire();

        h2.personelIsmi="hatice";
        h2.personelTelefon="56758";
        h2.personelAdresi="sincan";
        h2.bashekimIsmi="yasar kemal";

        System.out.println("p1 : " + h1);
        System.out.println("p2 : " + h2);

        AHemsire h3= new AHemsire();
        System.out.println("h3 : " + h3);
        h3.hastaneIsmi="java hastanesi";
        System.out.println(" h3 : " + h3);

        System.out.println("h2 :" + h2.hastaneIsmi);



    }
}
