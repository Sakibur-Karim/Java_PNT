package javaCollection;

public class HashSet {

    public static void main(String[] args) {
        java.util.HashSet<String> h = new java.util.HashSet<>();
        h.add("a");
        h.add("a");
        h.add("b");
        h.add("c");
        h.add(null);
        System.out.println(h);
    }
}
