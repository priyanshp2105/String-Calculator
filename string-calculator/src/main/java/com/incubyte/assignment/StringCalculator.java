package com.incubyte.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        String delimiterRegex = ",|\n";

        if (numbers.startsWith("//")) {
            int delimiterEndIndex = numbers.indexOf("\n");
            String delimiterPart = numbers.substring(2, delimiterEndIndex);

            if (delimiterPart.startsWith("[") && delimiterPart.endsWith("]")) {
                // Support delimiters of any length
                List<String> delimiters = new ArrayList<>();
                Matcher m = Pattern.compile("\\[(.*?)\\]").matcher(delimiterPart);
                while (m.find()) {
                    delimiters.add(Pattern.quote(m.group(1)));
                }
                delimiterRegex = String.join("|", delimiters);
            } else {
                delimiterRegex = Pattern.quote(delimiterPart);
            }

            numbers = numbers.substring(delimiterEndIndex + 1);
        }

        String[] tokens = numbers.split(delimiterRegex);
        List<Integer> negatives = new ArrayList<>();
        int sum = 0;

        for (String token : tokens) {
            int num = Integer.parseInt(token);
            if (num < 0) {
                negatives.add(num);
            }
            if (num <= 1000) {
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
