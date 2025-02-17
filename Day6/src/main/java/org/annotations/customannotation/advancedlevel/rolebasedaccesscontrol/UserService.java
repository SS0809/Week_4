package org.annotations.customannotation.advancedlevel.rolebasedaccesscontrol;
public class UserService {

    @RoleAllowed("ADMIN")
    public void performAdminTask() {
        System.out.println("Admin task performed!");
    }

    @RoleAllowed("USER")
    public void performUserTask() {
        System.out.println("User task performed!");
    }
}
