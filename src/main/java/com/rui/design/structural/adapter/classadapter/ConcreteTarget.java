package com.rui.design.structural.adapter.classadapter;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget目标方法");
    }
}
