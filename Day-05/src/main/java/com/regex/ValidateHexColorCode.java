package com.regex;

public class ValidateHexColorCode {
    public static boolean validateHex(String code){
        String regex="^[#][A-Fa-f0-9]{6}$";
        return code.matches(regex);
    }

    public static void main(String[] args) {
        String code="#FFA500";
        boolean isValid=validateHex(code);
        if(isValid==true){
            System.out.println("Hex color code is valid");
        }
        else{
            System.out.println("Hex color code is invalid");
        }
    }
}
