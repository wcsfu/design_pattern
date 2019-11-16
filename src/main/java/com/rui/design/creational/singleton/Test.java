package com.rui.design.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/27
 * @描述
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //  LazySingleton lazySingleton = LazySingleton.getInstances();
//        Thread thread1 =new Thread(new T());
//        Thread thread2 =new Thread(new T());
//        thread1.start();
//        thread2.start();
//        System.out.println("program end");
        String singleton_file_txt = Thread.currentThread().getContextClassLoader().getResource("singleton_file.txt").getFile();
        /**
         * 序列化破坏单例模式
         *//*
        HungrySingleton instances = HungrySingleton.getInstances();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(singleton_file_txt));
        oos.writeObject(instances);
        File file = new File(singleton_file_txt);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        System.out.println(instances);
        System.out.println(newInstance);
        System.out.println(instances == newInstance);*/
        /**
         * 反射攻击解决方案及原理分析
         */
        //饿汉式
        /*Class objectClass = HungrySingleton.class;
        Constructor declaredConstructor = objectClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        HungrySingleton instances = HungrySingleton.getInstances();
        HungrySingleton newInstance = (HungrySingleton) declaredConstructor.newInstance();
        System.out.println(instances);
        System.out.println(newInstance);
        System.out.println(instances == newInstance);*/
        //静态内部类
        /*Class objectClass = StaticInnerClassSingleton.class;
        Constructor declaredConstructor = objectClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        StaticInnerClassSingleton instances=StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton newInstance=(StaticInnerClassSingleton)declaredConstructor.newInstance();
        System.out.println(instances);
        System.out.println(newInstance);
        System.out.println(instances == newInstance);*/
        //懒汉式
       /* Class objectClass = LazySingleton.class;
        Constructor declaredConstructor = objectClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        LazySingleton newInstance=(LazySingleton)declaredConstructor.newInstance();
        LazySingleton instances=LazySingleton.getInstances();

        System.out.println(instances);
        System.out.println(newInstance);
        System.out.println(instances == newInstance);*/
       //enum单例模式(最佳的单例模式)
        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(singleton_file_txt));
        oos.writeObject(instance);
        File file = new File(singleton_file_txt);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        EnumInstance newInstance = (EnumInstance) ois.readObject();
        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());

    }
}
