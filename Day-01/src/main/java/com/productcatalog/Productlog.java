package com.productcatalog;

import java.util.ArrayList;
import java.util.List;

class Productlog<T extends Product> {
    List<T> products = new ArrayList<>();

    void addProducts(T product) {
        products.add(product);
    }

    public List<T> getProducts() {
        return products;
    }

    void displayAllProducts() {
        for (T product : products) {
            System.out.println(product);
        }
    }
}
