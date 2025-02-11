package org.generics.dynamicmarket;

// Generic product class with bounded type parameter
public class Product<T extends Category> {
    private String name;
    private double price;
    private T category;
    private String description;

    public Product(String name, double price, T category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public T getCategory() { return category; }
    public String getDescription() { return description; }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Product: %s, Price: $%.2f, Category: %s, Description: %s",
                name, price, category.getCategoryName(), description);
    }
}
