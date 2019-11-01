package com.rui.design.structural.decorator.v1;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc()+"加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
