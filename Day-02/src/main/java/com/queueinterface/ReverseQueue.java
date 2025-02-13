package com.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void reverse(Queue<Integer>queue) {

        if(queue.isEmpty()){
            return;
        }
        int front=queue.poll();
        reverse(queue);
        queue.add(front);
    }
    public static void main(String[] args) {
       Queue<Integer>queue=new LinkedList<>();
       queue.add(10);
        queue.add(20);
        queue.add(30);
       // System.out.println(queue);
       reverse(queue);
        System.out.println(queue);

    }
}
