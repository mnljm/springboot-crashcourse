package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    ProductRepository prodRep;


    @BeforeEach
    void setup(){
        prodRep = new ProductRepository();
    }

    @Test
    void findAll() {
        ArrayList products = new ArrayList();
        final AtomicLong nextId = new AtomicLong(1);
        products.add(new Product(nextId.getAndIncrement(), "Laptop", 1200.00));
        products.add(new Product(nextId.getAndIncrement(), "Mouse", 25.50));
        products.add(new Product(nextId.getAndIncrement(), "Keyboard", 75.00));
        assertEquals(prodRep.findAll(), products);
    }

    @Test
    void findById() {
        
    }

    @Test
    void save() {
    }
}