package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrency {
    public static void currency(String text){
        String regex="\\$?\\d+\\.\\d{2}";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        if(matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }

    public static void main(String[] args) {
        String text="The price is $45.99, and the discount is 10.50.";
        currency(text);
    }
}
