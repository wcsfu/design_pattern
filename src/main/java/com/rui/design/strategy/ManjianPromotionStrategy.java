package com.rui.design.strategy;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class ManjianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销，满200减20元");
    }
}
