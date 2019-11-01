package com.rui.design.structural.adapter.classadapter;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述 适配者（适配被适配者达到目标）
 */
//继承被适配者实现被实现的目标
public class Adapter extends Adaptee implements Target {
    /**
     * 接口target的具体实现通过adapter移交给了adaptee（被适配者）
     */
    @Override
    public void request() {
        //.....
        //调用adaptee的方法。把被适配者的方法适配给了target目标
        super.adpateeRequest();
        //.....
    }
}
