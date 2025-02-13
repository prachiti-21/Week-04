package com.productcatalog;

class Book extends Product{

    public Book(double percentage,double price,String productName){
        super(percentage,price,productName);
    }

    public void applyDiscount( Book book, double percentage){
        double finalPrice= getPrice()- (getPrice()/100)* percentage;
        System.out.println("Price after discount: "+finalPrice);
    }

    public  void display(){
        System.out.println("Book name: "+getProductName());
        System.out.println("Book price: "+getPrice());

    }
}
