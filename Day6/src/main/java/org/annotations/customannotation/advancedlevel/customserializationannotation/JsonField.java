package org.annotations.customannotation.advancedlevel.customserializationannotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface JsonField {
    String name();
}
