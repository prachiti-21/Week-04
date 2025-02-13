package com.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class Binary {
    public static String convertToBinary(int n){
        String binary;

             binary=Integer.toBinaryString(n);
             return binary;


    }
    public static void addToQueue(Queue<String>queue,int n){

        for(int i=1;i<=n;i++){
            String b=convertToBinary(i);
            queue.add(b);
        }
        System.out.println(queue);
    }

    public static void main(String[] args) {
        Queue<String>queue=new LinkedList<>();
        int n=5;
        addToQueue(queue,n);
    }
}
