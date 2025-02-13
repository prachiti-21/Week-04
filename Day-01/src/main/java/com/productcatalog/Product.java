package com.productcatalog;

abstract class Product {

    private double percentage;
    private double price;
    private String productName;
   Product(double percentage,double price,String productName){
       this.percentage=percentage;
       this.price=price;
       this.productName=productName;
   }
    public double getPercentage(){
        return percentage;

    }
    public double getPrice(){
        return  price;
    }
    public String getProductName(){
        return productName;
    }

    abstract  void  display();


   @Override
     public String toString() {
         return "Product{name='" + productName + "', price=" + price + "}";
     }

}
/*class Book extends Product{

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
class ProductCatalog{
    public static void main(String[] args) {
        Book b=new Book(20,500,"abs");
        Book b2=new Book(10,300,"abc");
        Productlog<Book> bookProduct=new Productlog<>() ;
        Cloth c=new Cloth(10,400,"Shirt");
        Productlog<Cloth> clothProduct=new Productlog<>();
        bookProduct.addProducts(new Book(20,200,"Alchemist"));
        bookProduct.displayAllProducts();
        b.applyDiscount(b, b.getPercentage());
        bookProduct.addProducts(new Book(10,300,"abc"));
        bookProduct.displayAllProducts();
        b.applyDiscount(b, b.getPercentage());
        clothProduct.addProducts(new Cloth(10,400,"Shirt"));
        clothProduct.displayAllProducts();
        c.applyDiscount(c,c.getPercentage());
        clothProduct.addProducts(new Cloth(30,600,"Dress"));
        clothProduct.displayAllProducts();
        c.applyDiscount(c,c.getPercentage());
       // b.applyDiscount(b, b.getPercentage();
        //bookProduct.displayAllProducts();


        System.out.println();

        //Product<Cloth>clothProduct=new Cloth(10,500,"Shirt");
        //bookProduct.applyDiscount(new Book(20,200,"Alchemist"), bookProduct.getPercentage());
        //bookProduct.display(bookProduct);
       // clothProduct.applyDiscount(new Cloth(10,500,"Shirt"), clothProduct.getPercentage());
        //clothProduct.display(clothProduct);
        //Product.display(bookProduct.getProductName());
    }
}*/