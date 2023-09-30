package javaCollection;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<String> s = new java.util.Stack<>();
        s.push("a");
        s.push("b");
        s.push("c");
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.search("a"));
    }
}
