package com.incubyte.assignment;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void emptyStringShouldReturnZero() {
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.add(""));
    }
}
