public class ExceptionalHandling1 {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        try {
            System.out.println(100 / 0);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("1");
        System.out.println("1");

        int[] numList = new int[6];
        try {
            numList[10] = 6;
            System.out.println("Inside try block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index number");
            e.printStackTrace();

        } finally {
            System.out.println("Finally block");
        }
        System.out.println("Outside the finally block");
    }
}
