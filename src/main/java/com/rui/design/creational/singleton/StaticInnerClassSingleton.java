package com.rui.design.creational.singleton;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/27
 * @描述
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){

    }


    /**
     * 静态内部类的单例模式（JVM对象初始化锁屏蔽了多线程条件下其他线程对初始化对象的使用）,屏蔽了多线程对象初始化重排序的问题
     */
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton=new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}
