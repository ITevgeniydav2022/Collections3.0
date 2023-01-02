package product;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {

    private String name;
    private int price;
    private int weight;

    public Product(String name, int price, int weight) {

        setName(name);

        setPrice(price);

        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью! ");
        }
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price<=0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью! ");
        }
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (price<=0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью! ");
        }
        this.weight = weight;
    }



    @Override
    public String toString() {
        return name +
                ", цена " + price +
                " руб. вес " + weight +
                " гр.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product products = (Product) o;
        return Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}