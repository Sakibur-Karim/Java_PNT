public class Array {
    public static void main(String[] args) {
        String s = "Today is great";
        char[] charArray = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(charArray[i]);
        }
    }
}
