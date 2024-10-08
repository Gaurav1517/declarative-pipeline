package in.javahome.myweb.controller;

import junit.framework.Assert;  // Change to JUnit 4 imports
import junit.framework.TestCase; // Change to JUnit 4 imports
import org.junit.Test;

public class CalculatorTest extends TestCase {

    @Test
    public void testAddition() {
        int a = 5;
        int b = 10;
        int expected = 15;
        int result = a + b;
        Assert.assertEquals(expected, result);
    }
}
