package org.generics.dynamicmarket;

public class GadgetCategory extends BaseCategory {
    private final String techType;
    private final boolean requiresPowerSource;

    public GadgetCategory(String name, String description, String techType, boolean requiresPowerSource) {
        super(name, description);
        this.techType = techType;
        this.requiresPowerSource = requiresPowerSource;
    }

    public String getTechType() { return techType; }
    public boolean requiresPowerSource() { return requiresPowerSource; }
}