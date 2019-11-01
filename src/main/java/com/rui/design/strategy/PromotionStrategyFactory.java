package com.rui.design.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LijianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManjianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanxianPromotionStategy());
    }

    private PromotionStrategyFactory() {

    }

    public static PromotionStrategy getPromotionStrategy(String key) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(key);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey {
        String LIJIAN = "LIJIAN";
        String MANJIAN = "MANJIAN";
        String FANXIAN = "FANXIAN";

    }
}
