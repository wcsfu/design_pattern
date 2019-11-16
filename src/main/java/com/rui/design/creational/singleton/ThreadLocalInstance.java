package com.rui.design.creational.singleton;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/11
 * @描述
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> threadLocal = new ThreadLocal<ThreadLocalInstance>() {

        /**
         * 充血ThreadLocal的初始化方法进行实例化
         * @return
         */
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();

        }
    };

    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance() {
        return threadLocal.get();
    }
}
