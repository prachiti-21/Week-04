package com.regex;

import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public static void extractLink(String text){
        String regex="\\bhttps?://[a-zA-Z0-9._%+-]+\\.[a-zA-Z]{2,6}(/[a-zA-Z0-9._%+-]*)*\\b";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }

    public static void main(String[] args) {
        String text="Visit https://www.google.com and http://example.org for more info.";
        extractLink(text);

    }
}
