package com.rui.design.creational.singleton;

import java.io.Serializable;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/27
 * @描述
 */
public class HungrySingleton implements Serializable {
    //饿汉式
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstances() {
        return hungrySingleton;
    }

    /**
     * 保证序列化为同一个对象（跟ObjectOutputStream 和ObjectInputStream有关）
     * @return
     */
    private Object readResolve(){
        return hungrySingleton;
    }

}
