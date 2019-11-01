package com.rui.design.structural.bridge;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    //与接口的方法名相同
    abstract Account openAccount();

}
