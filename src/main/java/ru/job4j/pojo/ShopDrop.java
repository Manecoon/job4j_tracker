package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        if (index == products.length - 1) {
            products[products.length - 1] = null;
        }
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
            if (i == products.length - 2) {
                products[products.length - 1] = null;
            }
        }
        return products;
    }
}