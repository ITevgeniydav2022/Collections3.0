package product;

import java.util.*;

public class Recipe {

    private final String name;
    private final Map<Product, Integer> products;
    private  int totalCost;

    public Recipe(String name) {
        this.name = name;
        this.products = new HashMap<>();
        this.totalCost = 0;
    }

    public void add(Product product) {
        add(product, 1);
    }

    public void add(Product product, int quantity) {
        if (products.containsKey(product)) {
            throw new IllegalArgumentException(" Такой продукт уже есть в рецепте! ");
        }
        products.put(product, quantity);
        totalCost += quantity* product.getPrice();
    }

    public String getName() {
        return name;
    }



    public int getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "Рецепт: " + name  +
                " - стоимость " + totalCost +
                " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

