package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCaptilizedWords {
    public static void extractWords(String text){
        String regex="[A-Z][a-z]{1,}";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }

    public static void main(String[] args) {
        String text="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        extractWords(text);

    }
}
