package org.annotations.customannotation.advancedlevel.rolebasedaccesscontrol;
import java.lang.reflect.Method;

public class AccessControl {

    public static void checkAccess(Object obj, Method method, String currentUserRole) {
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            String requiredRole = roleAllowed.value();

            if (!currentUserRole.equals(requiredRole)) {
                System.out.println("Access Denied!");
                return;
            }
        }

        try {
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
