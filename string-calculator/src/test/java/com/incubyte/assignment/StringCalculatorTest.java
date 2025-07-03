package com.incubyte.assignment;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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

    @Test
    public void multipleNumbersShouldReturnTheirSum() {
        StringCalculator calc = new StringCalculator();
        assertEquals(10, calc.add("1,2,3,4"));
        assertEquals(21, calc.add("5,7,9"));
    }

    @Test
    public void numbersSeparatedByNewlinesShouldAlsoBeSummed() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("1\n2,3"));
        assertEquals(10, calc.add("4\n1\n2,3"));
    }

    @Test
    public void supportCustomSingleCharacterDelimiter() {
        StringCalculator calc = new StringCalculator();
        assertEquals(3, calc.add("//;\n1;2"));
        assertEquals(6, calc.add("//*\n1*2*3"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwExceptionForNegativeNumbers() {
        StringCalculator calc = new StringCalculator();
        calc.add("1,-2");
    }

    @Test
    public void exceptionMessageShouldListAllNegativeNumbers() {
        StringCalculator calc = new StringCalculator();
        try {
            calc.add("1,-2,3,-4");
            fail("Exception was expected");
        } catch (IllegalArgumentException e) {
            assertEquals("negative numbers not allowed: -2,-4", e.getMessage());
        }
    }

}
