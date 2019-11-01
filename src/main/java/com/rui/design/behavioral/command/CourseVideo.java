package com.rui.design.behavioral.command;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }
    public void open(){
        System.out.println(this.name+"视屏课程开放");
    }
    public void close(){
        System.out.println(this.name+"视屏课程关闭");
    }
}
