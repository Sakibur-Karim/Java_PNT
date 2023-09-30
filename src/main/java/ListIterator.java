import java.util.LinkedList;

public class ListIterator {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("Arif");
        l.add("Amzal");
        l.add("Harry");
        l.add("Tanbir");

        java.util.ListIterator<String> ll = l.listIterator();
        System.out.println();
        while (ll.hasNext()) System.out.println(ll.next());
        while (ll.hasPrevious()) System.out.println(ll.previous());
    }
}
