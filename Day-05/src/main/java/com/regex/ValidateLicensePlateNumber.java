package com.regex;

import java.util.regex.Pattern;

public class ValidateLicensePlateNumber {
    public static boolean validate(String plateNumber){
        String regex="^[A-Z][A-Z][0-9]{4}$";
        return plateNumber.matches(regex);
    }

    public static void main(String[] args) {
        String plateNumber="AB1234";
       boolean isValid=validate(plateNumber);
       if(isValid==true){
           System.out.println("License plate number is valid");
       }
       else{
           System.out.println("License plate number is invalid");
       }
    }
}
