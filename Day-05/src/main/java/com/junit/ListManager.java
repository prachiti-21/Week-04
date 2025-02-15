package com.junit;
import java.util.ArrayList;
import java.util.List;

public class ListManager {
    public static void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public static void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    public static int getSize(List<Integer> list) {
        return list.size();
    }

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        int element=5;
        addElement(list,element);
        removeElement(list,element);
        System.out.println(getSize(list));
    }
}

