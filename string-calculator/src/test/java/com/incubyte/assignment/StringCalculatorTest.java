package com.incubyte.assignment;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void emptyStringShouldReturnZero() {
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.add(""));
    }

    @Test
    public void singleNumberShouldReturnThatNumber() {
        StringCalculator calc = new StringCalculator();
        assertEquals(1, calc.add("1"));
    }

    @Test
    public void twoNumbersShouldReturnTheirSum() {
        StringCalculator calc = new StringCalculator();
        assertEquals(3, calc.add("1,2"));
    }

}
