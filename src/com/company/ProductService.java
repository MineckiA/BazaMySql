package com.company;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProductService implements IBaseActions {
    private static final ProductService Instance = new ProductService();
    Scanner scanner = new Scanner(System.in);
    private ProductService(){
    }

    public static ProductService GetInstance(){
        return Instance;
    }

    public void CreateNewProduct(){
        System.out.println("Nazwa produktu");
        String name = scanner.nextLine();
        System.out.println("Cena produktu");
        int price = scanner.nextInt();
        Product NewProduct = new Product(name, price);
        ProductRepository.ProductList.add(NewProduct);
        System.out.println("Produkt dodany");
    }

    public void DeleteProduct(){
        System.out.println("Podaj ID produktu do usuniecia");
        int productId = scanner.nextInt();
        var selectProduct = ProductRepository.ProductList.stream().filter(item -> item.Id==productId).collect(Collectors.toList());
        if (!selectProduct.isEmpty())
            Repository.UserList.remove(selectProduct.get(0));
        else
            System.out.println("Brak produktu o takim ID");
    }

    public void DeleteAll() {
        System.out.println("Usuwam wszystkich użytkowników");
        ProductRepository.ProductList.clear();
    }

    public void ShowProduct() {
        System.out.println("Podaj ID produktu");
        int productId = scanner.nextInt();
        System.out.println(ProductRepository.ProductList.get(productId));
    }


    public void ShotAllProduct() {
        ProductRepository.ProductList.forEach( x -> System.out.println(x));
    }

    public void ModifyProduct(){
        System.out.println("Podaj id którego produktu dane chcesz zmienić");
        int productId = scanner.nextInt();
        System.out.println("Nazwa produktu");
        String name = scanner.next();
        System.out.println("Cena produktu");
        int price = scanner.nextInt();
        Product newProduct = new Product(name,price);
        ProductRepository.ProductList.set(productId,newProduct );
    }


    @Override
    public Object GetById(int Id) {
        return null;
    }

    @Override
    public void DeleteById(int Id) {

    }
}

