package com.rui.design.structural.bridge;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述 定期账号
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
