package com.readandwrite;
import java.io.*;
public class ReadAndWrite {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("input.txt");
        FileOutputStream fos= new FileOutputStream("output.txt")){

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("source file does not exists.");

        }
    }
}


