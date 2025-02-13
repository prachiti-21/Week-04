package com.productcatalog;

class Cloth extends Product{

    Cloth(double percentage,double price,String productName){
        super(percentage,price,productName);
    }

    void applyDiscount(Cloth cloth, double percentage){
        double finalPrice= getPrice()- (getPrice()/100)*percentage;
        System.out.println("Price after discount: "+finalPrice);
    }

    public  void  display(){
        System.out.println("Cloth : "+getProductName());
        System.out.println("Cloth price: "+getPrice());

    }
}