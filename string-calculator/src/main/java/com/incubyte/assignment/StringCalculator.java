package com.incubyte.assignment;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        // Replace newline with comma, then split
        String[] tokens = numbers.replace("\n", ",").split(",");

        int sum = 0;
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }
        return sum;
    }

}
