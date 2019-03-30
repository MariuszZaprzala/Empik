package com.zaprzala.mariusz;

import java.math.BigDecimal;

public abstract class Product {

    long id = 0;
    String name;
    BigDecimal price;

    public Product(long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
