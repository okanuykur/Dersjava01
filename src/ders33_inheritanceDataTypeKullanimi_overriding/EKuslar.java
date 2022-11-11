package ders33_inheritanceDataTypeKullanimi_overriding;

public class EKuslar extends DHayvanlar{
    protected void kanat(){
        System.out.println("kuslar kanatlidirlar");
    }
    protected void solunum(){
        System.out.println("kuslar akcigerleri ile nefes alirlar");
    }
    protected void gaga(){
        System.out.println("kuslarin gagalari vardie");
    }
    protected void cogalma(){
        System.out.println("kuslar yumurtayla cogalirlar");
    }

}
