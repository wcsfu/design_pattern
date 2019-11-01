package com.rui.design.strategy;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
//促销活动
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void excutePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}
