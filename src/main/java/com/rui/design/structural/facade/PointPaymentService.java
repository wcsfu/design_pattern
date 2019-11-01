package com.rui.design.structural.facade;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class PointPaymentService {

    public boolean pay(PointsGift pointsGift){
        //扣件积分
        System.out.println("支付"+pointsGift.getName()+"积分成功");
        return true;
    }
}
