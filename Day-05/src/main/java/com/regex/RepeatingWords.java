package com.regex;
import java.util.*;
import java.util.regex.*;
public class RepeatingWords {



        public static Set<String> findRepeatingWords(String text) {
            Map<String, Integer> wordCount = new HashMap<>();
            Set<String> repeatingWords = new HashSet<>();

            // Regular expression to match words
            String pattern = "\\b\\w+\\b";
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(text);

            while (matcher.find()) {
                String word = matcher.group().toLowerCase(); // Convert to lowercase for case insensitivity
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

                if (wordCount.get(word) > 1) {
                    repeatingWords.add(word);
                }
            }
            return repeatingWords;
        }

        public static void main(String[] args) {
            String text = "This is is a repeated repeated word test.";

            Set<String> repeatingWords = findRepeatingWords(text);
            System.out.println(String.join(", ", repeatingWords));
        }
    }


