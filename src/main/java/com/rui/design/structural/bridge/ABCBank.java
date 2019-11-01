package com.rui.design.structural.bridge;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
