package com.regex;

import java.util.ArrayList;
import java.util.List;

public class SensorBadWords {
    public static String sensor(String text) {
        List<String> badwords = new ArrayList<>();
        badwords.add("damn");
        badwords.add("stupid");
        badwords.add("idiot");
        badwords.add("mad");
        for (String badword : badwords) {
            text = text.replaceAll("(?i)\\b" + badword + "\\b", "****");
        }
        return text;

    }



    public static void main(String[] args) {
        String text="This is a damn bad example with some stupid words.";
        System.out.println(sensor(text));


    }
}
