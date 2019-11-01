package com.rui.design.creational.builder.v2;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/27
 * @描述
 */
public class Test {
    public static void main(String[] args) {
        //按需传入属性，链式调用
        Course course= new Course.CourseBuilder().buildCourseName("java设计模式精讲课程").buildCoursePPT("java设计模式精讲视屏").build();
        System.out.println(course);
    }
}
