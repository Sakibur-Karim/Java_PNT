import java.util.Arrays;

public class One {

    protected static void secondHighest(int[] arr) {
        if (arr.length < 2) System.out.println("Bad input");
        Arrays.sort(arr);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                System.out.println(arr[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 87, 87, 34, 56};
        secondHighest(arr);
    }


//    public static void removeDup(String s){
//        LinkedHashSet<Character> l = new LinkedHashSet<>();
//        for(int i = 0;i<s.length();i++) l.add(s.charAt(i));
//        for (Character c:l) System.out.print(c);
//    }
//    public static void main(String[] args) {
//        removeDup("Success");
//    }

//    public static void reverseString(String s) {
//        String str = "";
//        for(int i =s.length()-1;i>=0;i--){
//            str = str + s.charAt(i);
//        }
//        System.out.println(str);
//    }
//    public static void main(String[] args) {
//        reverseString("Success");
//    }

//    public static void countOcc(String s){
//        int count_S = 0;
//        int count_c = 0;
//        int count_s = 0;
//        int count_u = 0;
//        int count_e = 0;
//
//        for (int i =0; i<s.length();i++){
//            if(s.charAt(i)=='S') count_S++;
//            if(s.charAt(i)=='c') count_c++;
//            if(s.charAt(i)=='s') count_s++;
//            if(s.charAt(i)=='u') count_u++;
//            if(s.charAt(i)=='e') count_e++;
//        }
//        System.out.println("S="+count_S+" c="+count_c+" s="+count_s+" u="+count_u+" e="+count_e);
//    }
//    public static void main(String[] args) {
//        countOcc("Success");
//    }


}
