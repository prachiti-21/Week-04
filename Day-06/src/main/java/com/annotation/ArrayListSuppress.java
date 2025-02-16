package com.annotation;

import java.util.ArrayList;

class MakeArrayList{
    ArrayList list=new ArrayList();
    @SuppressWarnings("unchecked")
    public void add(){
        list.add(3);
        list.add(4);
        list.add("Hello");
        list.add(7.8);
    }
    @SuppressWarnings("unchecked")
    public void display(){
        System.out.println(list);
    }

}
public class ArrayListSuppress {
    public static void main(String[] args) {
        MakeArrayList arrlist= new MakeArrayList();
        arrlist.add();
        arrlist.display();
    }
}
