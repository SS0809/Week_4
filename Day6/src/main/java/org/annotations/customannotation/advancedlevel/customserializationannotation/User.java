package org.annotations.customannotation.advancedlevel.customserializationannotation;
public class User {

    @JsonField(name = "user_name")
    private String name;

    @JsonField(name = "user_age")
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
