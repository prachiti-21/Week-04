package com.junit;

public class StringUtils {
    public static String reverse(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static boolean isPalindrome(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            return true;
        }
        else {
            return false;
        }
    }
    public static String toUpperCase(String str){
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String str="aba";
        System.out.println("Reverse :"+reverse(str));
        System.out.println("Is Palindrome: "+isPalindrome(str));
        System.out.println("Uppercase: "+toUpperCase(str));
    }

}
