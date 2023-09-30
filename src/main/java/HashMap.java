public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String, String> h = new java.util.HashMap<>();
        h.put("NY", "New York");
        h.put("NJ", "New Jersey");
        h.put("NY", "Selenium");
        h.put("NY", "New York");

        h.put("M", "Practice");
        h.put("E", "Practice");

        h.put(null, "Florida");
        h.put("TX", null);
        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.get("M"));
        System.out.println(h.keySet());
        System.out.println(h.values());
        System.out.println(h.entrySet());
    }
}
