package com.rui.design.structural.proxy;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class OrderDaoImpl implements IOrderDao {

    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加order成功");
        return 1;
    }
}
