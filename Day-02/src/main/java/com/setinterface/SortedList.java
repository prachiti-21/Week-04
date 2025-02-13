package com.setinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class SortedList {
    public static void sorted(HashSet<Integer>set){
      List<Integer>list=new ArrayList<>();
      for(int num:set){
          list.add(num);
      }
      Collections.sort(list);
      System.out.println(list);
    }

    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);
        System.out.println("Sorted list: ");
        sorted(set);
    }
}
