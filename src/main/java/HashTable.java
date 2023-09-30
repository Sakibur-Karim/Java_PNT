import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String, String> h = new Hashtable<>();
        h.put("Harpreet", "Scrum Master");
        h.put("Arif", "DEV");
        h.put("Jana", "BA");
//        h.put(null, "HR");
//        h.put("Tanbir", null);
        h.put("Harpreet", "QA");

        h.put("Harpreet", "QA");
        System.out.println(h);
        for (Map.Entry<String, String> s : h.entrySet())
            System.out.println(h.values() + " " + h.keySet());
    }
}
