package com.listinterface;

import java.util.LinkedList;

public class NthElementFromEnd {
    public static void findNthElement(LinkedList<Character>list,int n){
        for(int i=0;i<=list.size();i++){
            System.out.println(list.get(list.size()-n));
            break;
        }
    }

    public static void main(String[] args) {
        LinkedList<Character>list=new LinkedList<>();
        int n=2;
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        findNthElement(list,n);
    }
}
