package com.rui.design.creational.abstractfactory;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/22
 * @描述
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory=new JavaCourseFactory();
        courseFactory.getVideo().produce();
        courseFactory.getArticle().produce();
    }
}
