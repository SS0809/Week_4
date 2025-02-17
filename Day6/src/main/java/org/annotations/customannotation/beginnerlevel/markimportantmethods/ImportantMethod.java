package org.annotations.customannotation.beginnerlevel.markimportantmethods;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ImportantMethod {
    String level() default "HIGH";
}
