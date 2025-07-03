package com.incubyte.assignment;

import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        String delimiter = ",|\n"; // Default delimiters

        if (numbers.startsWith("//")) {
            int delimiterEndIndex = numbers.indexOf("\n");
            delimiter = Pattern.quote(numbers.substring(2, delimiterEndIndex));
            numbers = numbers.substring(delimiterEndIndex + 1);
        }

        String[] tokens = numbers.split(delimiter);
        int sum = 0;
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }
        return sum;
    }

}
