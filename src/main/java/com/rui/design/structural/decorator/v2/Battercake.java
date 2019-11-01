package com.rui.design.structural.decorator.v2;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
