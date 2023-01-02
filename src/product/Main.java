package product;

import java.util.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //Задание 2
        System.out.println("Задание 2");


        Product apple = new Product("Яблоко", 50, 60);
        Product carrot = new Product("Морковь", 70, 90);
        Product potatoes = new Product("Картошка", 150, 500);
        Product peas = new Product("Горох", 100, 100);
        Product cucumber = new Product("Огурец", 80, 250);
        Product egg = new Product("Яйцо", 60, 60);
        Product sausage = new Product("Колбаса", 250, 500);

        Recipe olivier = new Recipe("Оливье");
        olivier.add(apple);
        olivier.add(carrot);
        olivier.add(egg);
        olivier.add(potatoes);
        olivier.add(peas);
        olivier.add(cucumber);
        olivier.add(sausage);
        //olivier.add(carrot);


        System.out.println(olivier);

        Map<Product, Integer> productMap = new HashMap<>();
        ProductList ProductList = new ProductList(productMap);
        ProductList.add(apple);
        ProductList.add(carrot);
        ProductList.add(egg);
        ProductList.add(potatoes);
        ProductList.add(peas);
        ProductList.add(cucumber);
        ProductList.add(sausage);

        System.out.println(ProductList);


    }
}
