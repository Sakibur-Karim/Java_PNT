package javaCollection;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<String> q = new LinkedList<>();
        q.offer("a");
        q.offer("b");
        q.offer("c");
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
