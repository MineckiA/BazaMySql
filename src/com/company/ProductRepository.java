package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public static List<Product> ProductList = new ArrayList<Product>();
    private static int Id = 0;

    public static int GetId(){
        return Id++;
    }

}
