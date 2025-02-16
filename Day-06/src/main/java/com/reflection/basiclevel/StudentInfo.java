package com.reflection.basiclevel;

import java.lang.reflect.*;

 class Student {
    private String name;
    private int standard;
    public Student(String name,int standard){
        this.name=name;
        this.standard=standard;

    }
    public String getName(){
        return name;
    }
    public int getStandard(){
        return standard;
    }
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Standard: "+getStandard());
    }

}
public class StudentInfo {
    public static void main(String[] args)  {

      try {
          Class<?> clazz = Class.forName("Student");
          Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
          Object studentObj = constructor.newInstance("John Doe", 12);
          clazz.getMethod("display").invoke(studentObj);
      } catch (Exception e) {
          e.printStackTrace();
      }

    }
}
