package com.rui.design.structural.proxy;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    public void setiOrderDao(IOrderDao iOrderDao) {
        this.iOrderDao = iOrderDao;
    }

    @Override
    public int saveOrder(Order order) {
        iOrderDao=new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
