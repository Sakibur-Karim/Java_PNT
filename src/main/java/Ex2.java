public class Ex2 {
    public static void main(String[] args) {
        String str = "Saturday";
        char[] charArray = str.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
