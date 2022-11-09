package praktickAyseHoca;

public class Mac extends LapTop {
    public static void main(String[] args) {
        Mac yeniMc= new Mac();

        System.out.println(yeniMc.marka);
        System.out.println(yeniMc.model);
        System.out.println(yeniMc.inch);

        Mac yeniMc2= new Mac();
        yeniMc2.marka="apple";
        yeniMc2.model="2013";
        yeniMc2.inch=19;
        System.out.println(yeniMc2.marka);
        System.out.println(yeniMc2.model);
        System.out.println(yeniMc2.inch);

        yeniMc.ram=8;
        yeniMc.hardDisk=256;
        yeniMc.lapTopTuru="yeni nesil";

        System.out.println(yeniMc.ram);
        System.out.println(yeniMc.hardDisk);
        System.out.println(yeniMc.lapTopTuru);
    }
}
