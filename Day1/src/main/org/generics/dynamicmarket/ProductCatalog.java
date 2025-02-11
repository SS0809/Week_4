package org.generics.dynamicmarket;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    public List<Product<? extends Category>> getProducts() {
        return products;
    }

    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public <T extends Product<? extends Category>> void applyDiscount(T product, double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Invalid discount percentage");
        }
        double discountFactor = 1 - (percentage / 100);
        product.setPrice(product.getPrice() * discountFactor);
    }

    public <T extends Category> List<Product<T>> getProductsByCategory(Class<T> categoryType) {
        List<Product<T>> result = new ArrayList<>();
        for (Product<?> product : products) {
            if (categoryType.isInstance(product.getCategory())) {
                Product<T> typedProduct = (Product<T>) product;
                result.add(typedProduct);
            }
        }
        return result;
    }
    public void printCatalog() {
        for (Product<?> product : products) {
            System.out.println(product);
        }
    }
}
