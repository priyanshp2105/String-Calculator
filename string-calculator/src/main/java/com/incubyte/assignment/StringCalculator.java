package com.incubyte.assignment;

import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        String delimiterRegex = ",|\n";

        if (numbers.startsWith("//")) {
            int delimiterEndIndex = numbers.indexOf("\n");
            String delimiterPart = numbers.substring(2, delimiterEndIndex);
            delimiterRegex = buildDelimiterRegex(delimiterPart);
            numbers = numbers.substring(delimiterEndIndex + 1);
        }

        String[] tokens = numbers.split(delimiterRegex);
        return computeSum(tokens);
    }

    private String buildDelimiterRegex(String delimiterPart) {
        if (delimiterPart.startsWith("[") && delimiterPart.endsWith("]")) {
            List<String> delimiters = new ArrayList<>();
            Matcher matcher = Pattern.compile("\\[(.*?)]").matcher(delimiterPart);
            while (matcher.find()) {
                delimiters.add(Pattern.quote(matcher.group(1)));
            }
            return String.join("|", delimiters);
        }
        return Pattern.quote(delimiterPart);
    }

    private int computeSum(String[] tokens) {
        List<Integer> negatives = new ArrayList<>();
        int sum = 0;

        for (String token : tokens) {
            if (token.trim().isEmpty())
                continue;

            int num = Integer.parseInt(token.trim());

            if (num < 0) {
                negatives.add(num);
            } else if (num <= 1000) {
                sum += num;
            }
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed: " +
                    negatives.stream().map(String::valueOf).collect(Collectors.joining(",")));
        }

        return sum;
    }
}
