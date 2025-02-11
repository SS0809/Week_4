package org.generics.dynamicmarket;

public class BookCategory extends BaseCategory {
    private final String genre;
    private final String targetAudience;

    public BookCategory(String name, String description, String genre, String targetAudience) {
        super(name, description);
        this.genre = genre;
        this.targetAudience = targetAudience;
    }

    public String getGenre() { return genre; }
    public String getTargetAudience() { return targetAudience; }
}
