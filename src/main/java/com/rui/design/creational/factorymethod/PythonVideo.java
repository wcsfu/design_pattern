package com.rui.design.creational.factorymethod;



/**
 * @创建人 wangrui
 * @创建时间 2019/10/22
 * @描述
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视屏");
    }
}
