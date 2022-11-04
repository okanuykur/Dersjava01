package ders28_varargs_stringBuilder;

public class C05_StringBuilder {

    public static void main(String[] args) {
         StringBuilder sb = new StringBuilder("Java candir.");
        System.out.println(sb.capacity()); // 16+12 =28
        System.out.println(sb.length());// 12
    }
}
