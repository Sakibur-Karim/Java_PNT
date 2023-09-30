import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitDemo {

    String message = "JUnit Learning";

    public static void main(String[] args) {
        JUnitDemo j = new JUnitDemo();
        j.displayMessage();

    }

    @Test
    public void displayMessage() {
        System.out.println("Executing JUnit test succcess");
        assertEquals(message, "JUnit Learning");
    }
}
