package com.listinterface;
import java.util.*;
public class Reverse {
    public static void reverseList(List<Integer>list){
         for(int i= list.size()-1;i>=0;i--){
             System.out.print(" "+list.get(i));
         }

    }
    public static void reverseLinkedList(LinkedList<Integer>linkedList){
        for(int i=linkedList.size()-1;i>=0;i--){
            System.out.print(" "+linkedList.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Reversed list: ");
        reverseList(list);
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println("\nReversed LinkedList: ");
        reverseLinkedList(linkedList);
    }
}
