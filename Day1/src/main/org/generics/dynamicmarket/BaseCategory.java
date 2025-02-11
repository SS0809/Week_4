package org.generics.dynamicmarket;

public abstract class BaseCategory implements Category{
    private final String name ;
    private final String description;
    protected BaseCategory (String name , String description) {
        this.name = name ;
        this.description = description;
    }
    @Override
    public String getCategoryName(){
        return name;
    }
    @Override
    public String getDescription(){
        return description;
    }
}