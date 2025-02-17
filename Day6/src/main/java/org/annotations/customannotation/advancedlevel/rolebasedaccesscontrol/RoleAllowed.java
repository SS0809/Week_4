package org.annotations.customannotation.advancedlevel.rolebasedaccesscontrol;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RoleAllowed {
    String value();
}
