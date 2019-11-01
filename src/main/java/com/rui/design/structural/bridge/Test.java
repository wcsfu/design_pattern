package com.rui.design.structural.bridge;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank =new ICBCBank(new DepositAccount());
        Account icbcAccount=icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 =new ICBCBank(new SavingAccount());
        Account icbcAccount2=icbcBank2.openAccount();
        icbcAccount2.showAccountType();


        Bank abcBank =new ABCBank(new DepositAccount());
        Account abcAccount=abcBank.openAccount();
        abcAccount.showAccountType();

        Bank abcBank2 =new ABCBank(new SavingAccount());
        Account abcAccount2=abcBank2.openAccount();
        abcAccount2.showAccountType();
    }
}
