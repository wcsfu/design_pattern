package com.rui.design.structural.adapter.classadapter;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class Test {
    public static void main(String[] args) {
//        Target target =new ConcreteTarget();
//        target.request();
        //适配器
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
