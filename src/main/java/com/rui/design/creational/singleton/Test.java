package com.rui.design.creational.singleton;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/27
 * @描述
 */
public class Test {

    public static void main(String[] args) {
      //  LazySingleton lazySingleton = LazySingleton.getInstances();
        Thread thread1 =new Thread(new T());
        Thread thread2 =new Thread(new T());
        thread1.start();
        thread2.start();
        System.out.println("program end");
    }
}
