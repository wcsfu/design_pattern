package com.rui.design.strategy;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class Test {
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LijianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanxianPromotionStategy());
//        promotionActivity618.excutePromotionStrategy();
//        promotionActivity1111.excutePromotionStrategy();
//
//    }

    public static void main(String[] args) {

        String promotionKey="MANJIAN";
        PromotionActivity promotionActivity =new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.excutePromotionStrategy();


    }
}
