package com.rui.design.structural.adapter;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5=new PowerAdapter();
        dc5.outputDC5V();
    }
}
