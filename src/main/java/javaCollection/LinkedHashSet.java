package javaCollection;

public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<String> l = new java.util.LinkedHashSet<>();
        l.add("NY");
        l.add("NY");
        l.add("NY");

        l.add(null);
        l.add("NJ");
        l.add("CA");
        l.add("TX");
        System.out.println(l);
        for (String s : l) System.out.println(l);
    }
}
