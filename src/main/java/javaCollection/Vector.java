package javaCollection;

public class Vector {
    public static void main(String[] args) {
        java.util.Vector<String> v = new java.util.Vector<String>();
        v.add("a");
        v.add("b");
        v.add("c");
        System.out.println(v);
        for (String f : v) {
            System.out.println(f);
        }
    }
}
