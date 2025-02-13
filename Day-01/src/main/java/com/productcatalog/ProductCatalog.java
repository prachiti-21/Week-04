package com.productcatalog;

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
}
