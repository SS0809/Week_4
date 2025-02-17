package org.annotations.customannotation.advancedlevel.customcachingsystem;

import java.util.HashMap;

public class CacheManager {
    private static final HashMap<String, Object> cache = new HashMap<>();

    public static Object getFromCache(String key) {
        return cache.get(key);
    }

    public static void putInCache(String key, Object value) {
        cache.put(key, value);
    }

    public static boolean isInCache(String key) {
        return cache.containsKey(key);
    }
}
