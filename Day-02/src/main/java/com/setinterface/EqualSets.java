package com.setinterface;

import java.util.HashSet;

public class EqualSets {
    public static boolean isEqual(HashSet<Integer>set1,HashSet<Integer>set2) {
        if (set1.size() != set2.size()) {
            return false;
        } else {

            if (set1.equals(set2)) {
                return true;
            } else {
                return false;
            }

        }
    }

    public static void main(String[] args) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(2);
        set2.add(1);
        System.out.println(isEqual(set1,set2));


    }
}
