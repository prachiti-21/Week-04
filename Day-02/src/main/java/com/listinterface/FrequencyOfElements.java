package com.listinterface;

import java.util.HashMap;
import java.util.*;
public class FrequencyOfElements {
    public static void findFrequency(HashMap<String,Integer>map,List<String>list){

        int n=list.size();
        for(int i=0;i<n;i++){
            if(map.containsKey(list.get(i))){
                map.put(list.get(i),map.get(list.get(i))+1);
            }
            else{
                map.put(list.get(i),1);
            }
        }
        System.out.println(map);

    }

    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();

        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        findFrequency(map,list);
    }
}
