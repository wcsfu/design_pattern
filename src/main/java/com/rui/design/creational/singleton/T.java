package com.rui.design.creational.singleton;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/27
 * @描述
 */
public class T implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstances();
        System.out.println(Thread.currentThread().getName()+" "+lazySingleton);
    }
}
