package com.rui.design.structural.bridge;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
