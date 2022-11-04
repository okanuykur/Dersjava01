package salonPratik;

public class Pen {
     String type= "LST";

    @Override
    public String toString() {
        return "Pen{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", point=" + point +
                '}';
    }

    String color = "GROEN";
     int point= 12;
        static boolean  cliced = false;

     public static void click (){
         cliced= true;
     }

     public static void  uncliced(){
         cliced = false;
     }
}
