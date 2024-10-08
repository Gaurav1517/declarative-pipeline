package in.javahome.myweb.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        // Example of a simple addition test
        int result = add(2, 3);
        Assertions.assertEquals(5, result); // Using Assertions from JUnit 5
    }

    // Assuming this is your addition method
    private int add(int a, int b) {
        return a + b;
    }
}
