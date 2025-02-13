package com.warehousemanagementsystem;
import java.util.*;
/*abstract class WarehouseItem<T> {
  private String name;
  private double price;

  public WarehouseItem(String name,double price){
      this.name=name;
      this.price=price;
  }
  public String getName(){
      return name;
  }
  public double getPrice(){
      return price;
  }
}
class Electronics extends WarehouseItem{
   // private String eName;
    //private int eId;
    //private float ePrice;
    public Electronics(String name,float price){
       super(name,price);

    }


}
class Groceries extends WarehouseItem{

    public Groceries(String name,double price){
      super(name,price);
    }



}
class Furniture extends WarehouseItem{

    public Furniture(String name,float price){
        super(name,price);
    }


}
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
}*/
public class SmartWarehouseManagement{
    public static void main(String[] args) {
        Storage<Electronics>electronicsStorage=new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop",50000));
        electronicsStorage.addItem(new Electronics("Television",1000000));

        Storage<Groceries>groceriesStorage=new Storage<>();
        groceriesStorage.addItem(new Groceries("Flour",50));
        groceriesStorage.addItem(new Groceries("Vegetables",80));

        Storage<Furniture>furnitureStorage=new Storage<>();
        furnitureStorage.addItem(new Furniture("Table",500));
        furnitureStorage.addItem(new Furniture("Chair",200));

        System.out.println("Electronics:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("Groceries: ");
        Storage.displayItems(groceriesStorage.getItems());

        System.out.println("Furniture:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}