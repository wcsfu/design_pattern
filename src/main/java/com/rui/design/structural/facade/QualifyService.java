package com.rui.design.structural.facade;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分校验通过，库存通过");
        return true;
    }
}
