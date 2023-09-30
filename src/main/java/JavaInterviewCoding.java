import java.util.Arrays;
import java.util.LinkedHashSet;

public class JavaInterviewCoding {

    // remove duplicate from the String Harpreet
    public static void removeDuplicate(String str) {
        LinkedHashSet<Character> l = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) l.add(str.charAt(i));
        for (Character c : l) System.out.print(c);
    }

    //print the second highest number from the array
    public static void secondHighest(int[] num) {
        int size = num.length;
        if (size < 2) System.out.println("Invalid input");
        Arrays.sort(num);
//        System.out.println(num[num.length-2]);
        for (int i = size - 2; i >= 0; i--) {
            if (num[i] != num[size - 1]) {
                System.out.println(num[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        String str = "Harpreet";
        removeDuplicate(str);
        System.out.println();
        int[] num = {21, 32, 53, 62, 62, 62, 62, 31, 51};
        secondHighest(num);
    }
}
