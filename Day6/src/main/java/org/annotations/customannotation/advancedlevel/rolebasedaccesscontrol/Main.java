package org.annotations.customannotation.advancedlevel.rolebasedaccesscontrol;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        UserService userService = new UserService();

        String currentUserRole = "ADMIN";

        Method adminTaskMethod = UserService.class.getMethod("performAdminTask");
        Method userTaskMethod = UserService.class.getMethod("performUserTask");

        System.out.println("Current User Role: " + currentUserRole);
        AccessControl.checkAccess(userService, adminTaskMethod, currentUserRole); // Should be allowed
        AccessControl.checkAccess(userService, userTaskMethod, currentUserRole);  // Should be allowed

        currentUserRole = "USER";
        System.out.println("\nCurrent User Role: " + currentUserRole);
        AccessControl.checkAccess(userService, adminTaskMethod, currentUserRole); // Should be denied
        AccessControl.checkAccess(userService, userTaskMethod, currentUserRole);  // Should be allowed
    }
}

