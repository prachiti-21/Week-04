package com.setinterface;

import java.util.HashSet;

public class SetOperation {
    public static void intersection(HashSet<Integer>set1,HashSet<Integer>set2){
        for(int num:set1){
            if(set2.contains(num)){
                System.out.println(num);

            }
        }
    }
    public static void union(HashSet<Integer>set1,HashSet<Integer>set2){
        HashSet<Integer>set3=new HashSet<>();
        for(int num:set1){
            set3.add(num);
        }
        for(int num:set2){
            set3.add(num);
        }
        System.out.println(set3);
    }

    public static void main(String[] args) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Intersection of 2 sets: ");
        intersection(set1,set2);
        System.out.println("Union of 2 sets: ");
        union(set1,set2);

    }
}
