package com.rui.design.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/27
 * @描述 懒汉式
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private static boolean flag =true;

    private LazySingleton() {
        //针对反射公共及
        if(flag){
            flag=false;
        }else{
            throw new RuntimeException("单例构造器禁止反射调用");

        }
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

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<LazySingleton> lazySingletonClass = LazySingleton.class;
        Constructor<LazySingleton> declaredConstructor = lazySingletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);


        LazySingleton instances = LazySingleton.getInstances();
        Field flag = instances.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.setBoolean(instances,true);
        LazySingleton lazySingleton = declaredConstructor.newInstance();

        System.out.println(lazySingleton);
        System.out.println(instances);
        System.out.println(lazySingleton == instances);
    }
}
