package com.regex;

public class ValidateCreditCard {
    public static boolean Visa(String visa){
        String regex="^4\\d{15}$";
        return visa.matches(regex);
    }
    public static boolean masterCard(String mastercard){
        String regex2="^5\\d{15}$";
        return mastercard.matches(regex2);
    }

    public static void main(String[] args) {
        String visa="4123456789012345";
        String mastercard="5123456789012345";
        boolean visaValid=Visa(visa);
        boolean MasterCardValid=masterCard(mastercard);
        if(visaValid){
            System.out.println("Visa is valid");
        }
        else{
            System.out.println("Visa is not valid");
        }
        if(MasterCardValid){
            System.out.println("Mastercard is valid");
        }
        else{
            System.out.println("Mastercard is not valid");
        }
    }


}
