package com.warehousemanagementsystem;
import java.util.*;
class Storage<T extends WarehouseItem>{
    private List<T> items=new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }
    public void removeItem(T item){
        items.remove(item);
    }
    public List<T> getItems(){
        return items;
    }
    public static void displayItems(List<? extends WarehouseItem>items){
        for(WarehouseItem item:items){
            System.out.println(item);
        }
    }
}