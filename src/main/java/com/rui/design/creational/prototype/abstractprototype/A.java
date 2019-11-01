package com.rui.design.creational.prototype.abstractprototype;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述 抽象类实现原型模式
 */
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
