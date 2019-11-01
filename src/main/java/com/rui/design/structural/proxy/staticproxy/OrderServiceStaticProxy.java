package com.rui.design.structural.proxy.staticproxy;

import com.rui.design.structural.proxy.IOrderService;
import com.rui.design.structural.proxy.Order;
import com.rui.design.structural.proxy.OrderServiceImpl;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    int saveOrder(Order order) {
        this.beforeMethod();
        iOrderService = new OrderServiceImpl();
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");
        afterMethod();
        return iOrderService.saveOrder(order);
    }

    private void beforeMethod() {
        System.out.println("静态代理 before code");
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}
