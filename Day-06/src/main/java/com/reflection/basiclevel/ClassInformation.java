package com.reflection.basiclevel;
import java.util.*;
import java.lang.reflect.*;
 class GetClassInfo {
    private String name;
    private int age;
    GetClassInfo(String name,int age){
        this.name=name;
        this.age=age;

    }
    public  String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class ClassInformation {
    public static void main(String[] args) {
        GetClassInfo info=new GetClassInfo("Prachiti",22);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter class name: ");
        String className=input.next();
        try{
            Class<?> clazz = Class.forName(className);

            Field[] classFields = info.getClass().getDeclaredFields();
            System.out.println("Fields in the class " + className + " are: ");

            for (Field field : classFields) {
                System.out.println(field.getName());
            }

            Method[] classMethods = info.getClass().getDeclaredMethods();
            System.out.println("Methods in the class " + className + " are: ");

            for (Method method : classMethods) {
                System.out.println(method.getName());
            }
            Constructor[] classConstructors = info.getClass().getDeclaredConstructors();
            System.out.println("Constructors in the class " + className + " are: ");

            for (Constructor constructor : classConstructors) {
                System.out.println(constructor.getName());
            }
        }catch (ClassNotFoundException e){
            System.out.println("Class not found: " + e.getMessage());
        }
        finally {
            input.close();
        }
    }
}
