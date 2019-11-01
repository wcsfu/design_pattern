package com.rui.design.creational.singleton;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/27
 * @描述 懒汉式
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    /**
     *  懒汉式，线程不安全(增加synchronized变成线程安全，关于加锁减锁非常消耗资源)
     * @return
     */
    public  static LazySingleton getInstances() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
