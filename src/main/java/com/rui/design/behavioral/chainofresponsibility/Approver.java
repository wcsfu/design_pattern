package com.rui.design.behavioral.chainofresponsibility;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
//批准者
public abstract class Approver {

    //责任链模式内部要声明一个自己类型（或者是子类）的声明者
    protected Approver approver;

    //设置下一个审批者
    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }


    public abstract void deploy(Course course);

}
