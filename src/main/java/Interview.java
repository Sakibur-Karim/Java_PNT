public class Interview {
    String string1, string2;

    public Interview(String a, String b) {
        string1 = a;
        string2 = b;
    }

    public static void main(String[] args) {
        Interview s = new Interview("java", "selenium");
        s.display();
    }

    public void display() {
        System.out.println(string1);
        System.out.println(string2);
    }
}
