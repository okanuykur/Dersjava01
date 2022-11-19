package btkJava;

public class btk_07productMain {

    public static void main(String[] args) {

        btk_07product product = new btk_07product(1,"laptop","asus",3000,2,"siyah");




        btk_07ProductManager productManager= new btk_07ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());


    }
}
