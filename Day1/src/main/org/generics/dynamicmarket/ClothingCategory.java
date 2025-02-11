package org.generics.dynamicmarket;

public class ClothingCategory extends BaseCategory {
    private final String size;
    private final String material;

    public ClothingCategory(String name, String description, String size, String material) {
        super(name, description);
        this.size = size;
        this.material = material;
    }

    public String getSize() { return size; }
    public String getMaterial() { return material; }
}