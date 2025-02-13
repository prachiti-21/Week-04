package com.warehousemanagementsystem;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
public class SmartWarehouseManagementTest {

    private Storage<Electronics> electronicsStorage;
    private Storage<Groceries> groceriesStorage;
    private Storage<Furniture> furnitureStorage;

        @BeforeEach
        void setUp() {
            electronicsStorage = new Storage<>();
            groceriesStorage = new Storage<>();
            furnitureStorage = new Storage<>();

            electronicsStorage.addItem(new Electronics("Laptop",50000));
            electronicsStorage.addItem(new Electronics("Television",1000000));

            groceriesStorage.addItem(new Groceries("Flour",50));
            groceriesStorage.addItem(new Groceries("Vegetables",80));

            furnitureStorage.addItem(new Furniture("Table",500));
            furnitureStorage.addItem(new Furniture("Chair",200));
        }

        @Test
        void testAddAndRetrieveItem() {
            assertEquals("Laptop", electronicsStorage.getItems().getName());
            assertEquals("Television", electronicsStorage.getItems().getName());
        }

        @Test
        void testStorageSize() {
            assertEquals(2, electronicsStorage.getItems().size());
            assertEquals(2, groceriesStorage.getItems().size());
            assertEquals(2, furnitureStorage.getItems().size());
        }

        @Test
        void testWildcardMethod() {
            assertDoesNotThrow(() -> Storage.displayItems(electronicsStorage.getAllItems()));
            assertDoesNotThrow(() -> Storage.displayItems(groceriesStorage.getAllItems()));
            assertDoesNotThrow(() -> Storage.displayItems(furnitureStorage.getAllItems()));
        }
    }

