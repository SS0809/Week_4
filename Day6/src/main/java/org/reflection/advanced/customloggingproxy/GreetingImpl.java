package org.reflection.advanced.customloggingproxy;
public class GreetingImpl implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("Hello, world!");
    }
}
