package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product;

    @BeforeEach
    void setup(){
        product = new Product(123L, "RX 9060XT", 23000);
    }

    @Test
    void getId() {
        assertEquals(123, product.getId());
    }

    @Test
    void getName() {
        assertEquals("RX 9060XT", product.getName());
    }

    @Test
    void getPrice() {
        assertEquals(23000, product.getPrice());
    }

    @Test
    void setId() {
        product.setId(124L);
        assertEquals(124L, product.getId());
    }

    @Test
    void setName() {
        product.setName("RTX 5060Ti");
        assertEquals("RTX 5060Ti", product.getName());
    }

    @Test
    void setPrice() {
        product.setPrice(26000);
        assertEquals(26000, product.getPrice());
    }

    @Test
    void testToString() {
        assertEquals("Product{id=123, name='RX 9060XT', price=23000.0}", product.toString());
    }

    @Test
    void testEquals() {
        assertTrue(product.equals(product));
    }

    @Test
    void testHashCode() {
        Product product2 = new Product(123L, "RX 9060XT", 23000);
        assertEquals(product2.hashCode(), product.hashCode());
    }
}