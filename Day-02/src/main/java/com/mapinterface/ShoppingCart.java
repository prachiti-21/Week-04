package com.mapinterface;

import java.util.*;

public class ShoppingCart {
    // HashMap to store product -> price
    private HashMap<String, Double> productPrices;
    // LinkedHashMap to store products in the order they were added
    private LinkedHashMap<String, Integer> cart;
    // TreeMap to display products sorted by price
    private TreeMap<Double, List<String>> sortedProducts;

    public ShoppingCart() {
        productPrices = new HashMap<>();
        cart = new LinkedHashMap<>();
        sortedProducts = new TreeMap<>();
    }

    // Method to add a product to the cart
    public void addProductToCart(String product, int quantity) {
        cart.put(product, quantity);
        // Ensure product price is available before adding it to the TreeMap
        if (productPrices.containsKey(product)) {
            double price = productPrices.get(product);
            sortedProducts.computeIfAbsent(price, k -> new ArrayList<>()).add(product);
        } else {
            System.out.println("Product price not available for: " + product);
        }
    }

    // Method to set product prices
    public void setProductPrice(String product, double price) {
        productPrices.put(product, price);
    }

    // Method to display the cart (order of items added)
    public void displayCart() {
        System.out.println("Shopping Cart (Items in order of addition):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue() + ", Price: " + productPrices.get(entry.getKey()));
        }
    }

    // Method to display items sorted by price
    public void displaySortedByPrice() {
        System.out.println("Products Sorted by Price:");
        for (Map.Entry<Double, List<String>> entry : sortedProducts.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println("Product: " + product + ", Price: " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Set product prices
        cart.setProductPrice("Apple", 1.50);
        cart.setProductPrice("Banana", 0.75);
        cart.setProductPrice("Orange", 1.20);
        cart.setProductPrice("Milk", 2.00);

        // Add products to the cart
        cart.addProductToCart("Apple", 3);
        cart.addProductToCart("Banana", 5);
        cart.addProductToCart("Milk", 2);
        cart.addProductToCart("Orange", 4);

        // Display cart in order of addition
        cart.displayCart();

        // Display products sorted by price
        cart.displaySortedByPrice();
    }
}

