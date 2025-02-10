package org.generics;

import java.util.ArrayList;
import java.util.List;

//1. Smart Warehouse Management System
//Concepts: Generic Classes, Bounded Type Parameters, Wildcards
//Problem Statement:
//You are developing a Smart Warehouse System that manages different types of items like Electronics, Groceries, and Furniture.
// The system should be able to store and retrieve items dynamically while maintaining type safety.
//        Hints:
//Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
//Implement a generic class Storage<T extends WarehouseItem> to store items safely.
//Implement a wildcard method to display all items in storage regardless of their type (List<? extends WarehouseItem>).
abstract class WarehouseItem{
    //Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
    private String name;
    public WarehouseItem(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }
}

class Storage<T extends WarehouseItem>{
    //Implement a generic class Storage<T extends WarehouseItem> to store items safely.
    public ArrayList<T> arrayList = new ArrayList<>();
    public void addItem(T item){
        arrayList.add(item);
    }
    public List<T> getItems(){
        return arrayList;
    }
}
class WarehouseUtils {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println("item: " + item.getName());
        }
    }
}
public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
//You are developing a Smart Warehouse System that manages different types of items like Electronics, Groceries, and Furniture.
        Storage<Furniture> furn = new Storage<>();
        Storage<Groceries> groc = new Storage<>();
        Storage<Electronics> elec = new Storage<>();
// The system should be able to store and retrieve items dynamically while maintaining type safety.
        furn.addItem(new Furniture("Chair"));
        groc.addItem(new Groceries("Tea"));
        elec.addItem(new Electronics("Wires"));
        WarehouseUtils.displayItems(furn.getItems());
        WarehouseUtils.displayItems(groc.getItems());
        WarehouseUtils.displayItems(elec.getItems());
    }
}