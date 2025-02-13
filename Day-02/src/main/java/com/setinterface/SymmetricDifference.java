package com.setinterface;

import java.util.HashSet;

public class SymmetricDifference {
    public static void symmetry(HashSet<Integer>set1,HashSet<Integer>set2){
        HashSet<Integer>set3=new HashSet<>();
        for(int num:set1){
            if(set2.contains(num)){
                set1.remove(num);
                set2.remove(num);
            }
        }
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
        symmetry(set1,set2);


    }
}
