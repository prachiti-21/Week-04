package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSpace {
    public static String replaceSpace(String text){
        return text.replaceAll("\\s+"," ").trim();
    }

    public static void main(String[] args) {
        String text="This is      an example with multiple  spaces.";
        System.out.println(replaceSpace(text));
    }
}
