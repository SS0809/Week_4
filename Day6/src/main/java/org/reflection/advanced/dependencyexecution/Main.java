package org.reflection.advanced.dependencyexecution;
public class Main {

    public static void main(String[] args) throws Exception {
        UserService userService = new UserService();
        DIContainer.injectDependencies(userService);
        userService.performService();
    }
}
