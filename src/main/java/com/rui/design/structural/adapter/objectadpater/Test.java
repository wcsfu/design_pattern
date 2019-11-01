package com.rui.design.structural.adapter.objectadpater;


/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class Test {
    public static void main(String[] args) {
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
