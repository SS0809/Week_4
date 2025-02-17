package org.annotations.customannotation.advancedlevel.customcachingsystem;
import java.lang.reflect.Method;

public class CacheAspect {

    public static Object executeWithCache(Object obj, Method method, Object[] args) throws Exception {
        String key = generateKey(method, args);

        if (CacheManager.isInCache(key)) {
            return CacheManager.getFromCache(key);
        }

        Object result = method.invoke(obj, args);

        if (method.isAnnotationPresent(CacheResult.class)) {
            CacheManager.putInCache(key, result);
        }

        return result;
    }

    private static String generateKey(Method method, Object[] args) {
        StringBuilder key = new StringBuilder(method.getName());
        for (Object arg : args) {
            key.append(arg.hashCode());
        }
        return key.toString();
    }
}
