package com.rui.design.structural.adapter.objectadpater;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class Adapter implements Target {
    //注入被适配者(区别于类适配器模式的继承方式)
    private Adaptee adaptee=new Adaptee();

    @Override
    public void request() {
        //...
        //调用被适配者的方法，实现target方法
        adaptee.adpateeRequest();
        //...
    }
}
