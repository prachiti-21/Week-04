package com.listinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void removeDuplicates(List<Integer>list){
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int num:list){
            set.add(num);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        removeDuplicates(list);
    }
}
