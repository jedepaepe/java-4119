package eu.epfc.c4119.lesson11.various;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        int expected = 5;
        int actual = calculator.add(2, 3);
        Assert.assertEquals(expected, actual);
    }
}