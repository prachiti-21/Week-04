package com.regex;

public class ValidateIPAddress {
    public static boolean validateIP(String ipAddress){
        String regex="^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        return ipAddress.matches(regex);

    }

    public static void main(String[] args) {
        String ipAddress="255.255.255.255";
        boolean isValid=validateIP(ipAddress);
        if(isValid==true){
            System.out.println("IP address is valid");
        }
        else{
            System.out.println("IP address is invalid");
        }

    }
}
