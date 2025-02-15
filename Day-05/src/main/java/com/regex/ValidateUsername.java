package com.regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        String regex="^[A-Za-z][A-Za-z0-9_]{5,15}$";
        Pattern pattern = Pattern.compile(regex);
        String username="user123";
        Matcher matcher = pattern.matcher(username);
        boolean b=matcher.matches();
        if(b==true){
            System.out.println("Username is valid");
        }
        else{
            System.out.println("username is invalid");
        }
    }
}
