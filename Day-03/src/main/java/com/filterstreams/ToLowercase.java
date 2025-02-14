package com.filterstreams;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ToLowercase {
    public static void main(String[] args) {
        try (BufferedReader fr = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter fw = new BufferedWriter(new FileWriter("output.txt"))) {
            String charData;
            while ((charData = fr.readLine())!=null){
               fw.write(charData.toLowerCase());
               fw.newLine();
            }
            System.out.println("Filed copied successfully");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
