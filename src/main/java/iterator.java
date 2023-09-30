import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(22);
        a.add(21);
        a.add(51);
        a.add(80);
        Iterator<Integer> i = a.iterator();
        while (i.hasNext()) System.out.println(i.next());
    }
}
