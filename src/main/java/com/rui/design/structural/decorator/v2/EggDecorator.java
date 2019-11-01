package com.rui.design.structural.decorator.v2;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
