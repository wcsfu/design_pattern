package com.rui.design.structural.decorator.v2;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class Test {

    public static void main(String[] args) {
        ABattercake aBattercake;
        //原始煎饼
        aBattercake =new Battercake();
        //煎饼加蛋
        aBattercake = new EggDecorator(aBattercake);
        aBattercake=new EggDecorator(aBattercake);
        //煎饼加肠
        aBattercake=new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc() + "销售价格:" + aBattercake.cost());

    }
}
