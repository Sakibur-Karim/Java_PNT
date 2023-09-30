import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer, String> m = new HashMap<>();
        m.put(1122, "Flushing");
        m.put(1212, "Forest Hills");
        System.out.println(m.keySet());
        for (int s : m.keySet()) System.out.println(s);
        for (String s : m.values()) System.out.println(s);
        for (java.util.Map.Entry<Integer, String> s : m.entrySet())
            System.out.println(s.getKey() + "\t" + s.getValue());
    }
}
