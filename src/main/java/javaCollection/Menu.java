package javaCollection;

import java.util.LinkedList;

public class Menu {
    public static void main(String[] args) {
        java.util.LinkedList<String> l = new LinkedList<>();
        l.add("Apetizers");
        l.add("MainCourse");
        l.add("Dessert");
        l.addFirst("Snack");
        l.addLast("GulabJamun");
        System.out.println(l);
    }
}
