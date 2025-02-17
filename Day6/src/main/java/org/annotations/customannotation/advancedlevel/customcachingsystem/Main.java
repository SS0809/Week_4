package org.annotations.customannotation.advancedlevel.customcachingsystem;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        Computation computation = new Computation();

        Method method = Computation.class.getMethod("computeExpensiveOperation", int.class);

        System.out.println("First call (expensive operation): " +
                CacheAspect.executeWithCache(computation, method, new Object[]{5}));

        System.out.println("Second call (should use cache): " +
                CacheAspect.executeWithCache(computation, method, new Object[]{5}));

        System.out.println("Third call (with different input): " +
                CacheAspect.executeWithCache(computation, method, new Object[]{10}));
    }
}
