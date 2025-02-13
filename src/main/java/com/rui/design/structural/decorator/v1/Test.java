package com.rui.design.structural.decorator.v1;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述  例子（非装饰者模式）
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + "销售价格:" + battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + "销售价格:" + battercakeWithEgg.cost());

        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc() + "销售价格:" + battercakeWithEggSausage.cost());


    }
}
