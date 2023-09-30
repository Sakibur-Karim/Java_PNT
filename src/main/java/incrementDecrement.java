public class incrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result;
        result = a + b + ++a + ++b;
        // 0 - -1 + 1 - 0
        int result2 = --a + --b;
        System.out.println("My result is" + result);

        System.out.println(result2);
    }

}
