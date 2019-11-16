package com.rui.design.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/11
 * @描述 容器单例
 */
public class ContainerSingleton {

    private static Map<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (key != null && !key.equals("")) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
