package com.company;

import java.util.Date;

public class Product {

    int Id;
    String Name;
    int Price;

    public Product(String name, int price) {
        Id = ProductRepository.GetId();
        Name = name;
        Price = price;
    }

    @Override
    public String toString() {
        return Id + " " + Name + " " + Price;
    }
}
