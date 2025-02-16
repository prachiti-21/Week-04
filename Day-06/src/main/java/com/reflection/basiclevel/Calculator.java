package com.reflection.basiclevel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    private int multiply(int a,int b){
        return a*b;
    }
}
class CalculatorResult{
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Calculator calculator=new Calculator();
        
        Method[]calcMethods=calculator.getClass().getDeclaredMethods();
        for(Method method:calcMethods){
            if(method.getName().equals("multiply")){
                method.setAccessible(true);
                System.out.println(method.invoke(calculator,2,3));
            }
        }
    }
}
