package com.listinterface;

import java.util.ArrayList;
import java.util.List;

public class RotateElements {
    public static void rotate(List<Integer>list,int position) {

        int i=0;

            while(i<position){

                int temp=list.get(0);
                list.remove(0);
                list.addLast(temp);
                i++;


            }

            System.out.println(list);

    }
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        int position=2;
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        rotate(list,position);
    }
}
