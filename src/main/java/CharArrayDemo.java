public class CharArrayDemo {
    public static void main(String[] args) {
        String str = "Selenium is testing tool";
        revStr(str);
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }

    public static void revStr(String str) {
        String newStr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            newStr = ch + newStr;
        }
        System.out.println(newStr);
    }

}
