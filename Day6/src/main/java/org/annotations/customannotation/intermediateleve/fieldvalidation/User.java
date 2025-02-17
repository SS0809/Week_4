package org.annotations.customannotation.intermediateleve.fieldvalidation;
import java.lang.reflect.Field;

public class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        validateUsername(username);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    private void validateUsername(String username) {
        Field field;
        try {
            field = User.class.getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                int maxLen = maxLength.value();
                if (username.length() > maxLen) {
                    throw new IllegalArgumentException("Username exceeds maximum length of " + maxLen);
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
