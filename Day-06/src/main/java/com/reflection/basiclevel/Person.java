package com.reflection.basiclevel;

import java.lang.reflect.*;

public class Person {
    private final int age;
    Person(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
class PersonInfo{
    public static void main(String[] args) throws IllegalAccessException {


        Person person = new Person(23);

        Field[] personfield = person.getClass().getDeclaredFields();
        for (Field field : personfield) {
            if (field.getName().equals("age")) {
                field.setAccessible(true);

                    field.set(person, 30);
                }
            }
        System.out.println("Modified age is "+person.getAge());
        }
     }


