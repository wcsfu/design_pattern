package com.rui.design.creational.factorymethod;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/22
 * @描述
 */
public class FeVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制FE课程视屏");
    }
}
