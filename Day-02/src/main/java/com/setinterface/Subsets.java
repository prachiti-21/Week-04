package com.setinterface;

import java.util.HashSet;

public class Subsets {
    public static boolean isSubset(HashSet<Integer>set1,HashSet<Integer>set2){
       for(int num:set1){
           if(!set2.contains(num)){
               return false;
           }
       }
       return true;
    }

    public static void main(String[] args) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        set1.add(2);
        set1.add(3);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        System.out.println(isSubset(set1,set2));

    }
}
