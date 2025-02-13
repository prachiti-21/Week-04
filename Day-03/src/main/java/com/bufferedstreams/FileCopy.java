package com.bufferedstreams;
import java.io.*;
public class FileCopy {
    public static void main(String[] args) {
        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("input.txt"));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("output.txt"))){
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            //float buffertime=System.nanoTime();
            System.out.println("File copied successfully with buffering.");
            //System.out.println("Time by buffered stream reader: "+buffertime);
        } catch (IOException e) {
            System.out.println("source file does not exists.");
        }
        float buffertime=System.nanoTime();
        System.out.println("Time by buffered stream reader: "+buffertime);

        try(FileInputStream fis=new FileInputStream("input.txt");
            FileOutputStream fos= new FileOutputStream("output.txt")){

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            //float normaltime=System.nanoTime();
            System.out.println("File copied successfully.");
            //System.out.println("Time by buffered stream reader: "+normaltime);
        } catch (IOException e) {
            System.out.println("source file does not exists.");

        }
        float normaltime=System.nanoTime();
        System.out.println("Time by normal file stream reader: "+normaltime);



    }


    }

