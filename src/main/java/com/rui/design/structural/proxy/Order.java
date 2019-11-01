package com.rui.design.structural.proxy;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class Order {
    private Object orderInfo;
    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
