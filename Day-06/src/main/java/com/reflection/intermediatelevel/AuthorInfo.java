package com.reflection.intermediatelevel;
import  java.lang.annotation.*;
@Author(name="Helly")
public class AuthorInfo {
  private String bookname;
  AuthorInfo(String bookname){
      this.bookname=bookname;
  }
  public String getBookname(){
      return bookname;
  }

}
class AuthorInformation{
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.reflection.intermediatelevel.AuthorInfo");

            if(clazz.isAnnotationPresent(Author.class)){
                Author author=clazz.getAnnotation(Author.class);
                System.out.println("Author: "+author.name());
            }
            else{
                System.out.println("No @author annotation present");
            }
        }catch (ClassNotFoundException e){
            System.out.println("Class not found"+e.getMessage());
        }
    }
}
