package com.rui.design.creational.factorymethod;





/**
 * @创建人 wangrui
 * @创建时间 2019/10/22
 * @描述
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory  videoFactory= new JavaVideoFactory();
        videoFactory.getVideo().produce();
//        videoFactory=new PythonVideoFactory();
//        videoFactory.getVideo().produce();
    }
}
