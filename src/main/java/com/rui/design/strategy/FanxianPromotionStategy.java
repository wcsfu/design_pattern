package com.rui.design.strategy;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class FanxianPromotionStategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放到慕课网用户的余额中");
    }
}
