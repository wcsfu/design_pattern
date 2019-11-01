package com.rui.design.strategy;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class LijianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销，课程的价格直接减去配置的价格");
    }
}
