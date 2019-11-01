package com.rui.design.structural.facade;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class GiftExchangeService {

    private QualifyService qualifyService=new QualifyService();
    private PointPaymentService pointPaymentService=new PointPaymentService();
    private ShippingService shippingService=new ShippingService();


    /**
     * 整合调用多个子系统
     * @param pointsGift
     */
    public void giftExchange(PointsGift pointsGift) {
        //资格校验通过
        if (qualifyService.isAvailable(pointsGift)) {
            //支付积分校验
            if (pointPaymentService.pay(pointsGift)) {
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，订单号是：" + shippingOrderNo);
            }
        }
    }
}
