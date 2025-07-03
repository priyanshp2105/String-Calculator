package com.incubyte.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        String delimiter = ",|\n";

        if (numbers.startsWith("//")) {
            int delimiterEndIndex = numbers.indexOf("\n");
            delimiter = Pattern.quote(numbers.substring(2, delimiterEndIndex));
            numbers = numbers.substring(delimiterEndIndex + 1);
        }

        String[] tokens = numbers.split(delimiter);
        List<Integer> negatives = new ArrayList<>();
        int sum = 0;

        for (String token : tokens) {
            int num = Integer.parseInt(token);
            if (num < 0) {
                negatives.add(num);
            }
            sum += num;
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed: " +
                    negatives.stream().map(String::valueOf).collect(Collectors.joining(",")));
        }

        return sum;
    }

}
