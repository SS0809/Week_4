package org.generics.dynamicmarket;

import java.util.ArrayList;
import java.util.List;

//2. Dynamic Online Marketplace
//Concepts: Type Parameters, Generic Methods, Bounded Type Parameters
//Problem Statement:
//Build a generic product catalog for an online marketplace that supports various product
// types like Books, Clothing, and Gadgets. Each product type has a specific price range and category.
//Hints:
//Define a generic class Product<T> where T is restricted to a category (BookCategory, ClothingCategory, etc.).
//Implement a generic method to apply discounts dynamically (<T extends Product> void applyDiscount(T product, double percentage)).
//Ensure type safety while allowing multiple product categories to exist in the same catalog.



interface Category{
    String getCategoryName();
    String getDescription();
}//all category must implement this class


public class DynamicMarketPlace {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        BookCategory technicalBooks = new BookCategory(
                "Technical Books",
                "Programming and technical reference materials",
                "Educational",
                "Professional Developers"
        );

        ClothingCategory mensWear = new ClothingCategory(
                "Men's Wear",
                "Casual and formal men's clothing",
                "M-XXL",
                "Cotton"
        );

        GadgetCategory smartphones = new GadgetCategory(
                "Smartphones",
                "Modern mobile devices",
                "Mobile",
                true
        );


        Product<BookCategory> book = new Product<>(
                "Java Programming Guide",
                49.99,
                technicalBooks,
                "Comprehensive guide to Java programming"
        );

        Product<ClothingCategory> shirt = new Product<>(
                "Classic Cotton T-Shirt",
                29.99,
                mensWear,
                "Comfortable casual wear"
        );

        Product<GadgetCategory> phone = new Product<>(
                "SmartPhone X",
                999.99,
                smartphones,
                "Latest flagship smartphone"
        );


        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);
        catalog.printCatalog();
        catalog.applyDiscount(book, 20.0);
        catalog.applyDiscount(phone, 10.0);
        catalog.printCatalog();
        List<Product<BookCategory>> books = catalog.getProductsByCategory(BookCategory.class);
        books.forEach(System.out::println);
    }
}
