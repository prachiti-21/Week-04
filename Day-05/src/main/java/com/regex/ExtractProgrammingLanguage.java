package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguage {
    public static void extractLanguage(String text){
        String[]language={"Java","Python","JavaScript","C","C\\+\\+","Go","Ruby","C#","Swift","PHP","Rust"};
        for(String lang:language){
            Pattern pattern =Pattern.compile("\\b" + lang + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher matcher=pattern.matcher(text);
            if(matcher.find()){
                System.out.print(matcher.group()+" ");
            }
        }
//        Pattern pattern =Pattern.compile(regex);
//        Matcher matcher=pattern.matcher(text);

    }

    public static void main(String[] args) {
        String text="I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        extractLanguage(text);
    }
    }

