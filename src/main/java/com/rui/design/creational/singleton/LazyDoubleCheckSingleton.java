package com.rui.design.creational.singleton;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/27
 * @描述
 */
public class LazyDoubleCheckSingleton {


    private volatile  static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    /**
     * DoubleCheck方式的懒汉模式
     *
     * @return
     */
    public static LazyDoubleCheckSingleton getInstances() {

        if (lazyDoubleCheckSingleton == null) {
            //加锁
            synchronized (LazyDoubleCheckSingleton.class) {
                //再次判断是否对象已经创建
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3。设置lazyDoubleCheckSingleton指向刚分配的内存地址
                    /**
                     * 重排序现象：允许2和3顺序对调.多线程中第一步的null判断就会返回一个初始化未完成的对象
                     * volatile 关键字可以防止2和3数据对调。
                     */
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
