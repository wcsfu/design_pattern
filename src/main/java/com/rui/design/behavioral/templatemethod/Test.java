package com.rui.design.behavioral.templatemethod;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class Test {

    public static void main(String[] args) {
//        System.out.println("后段设计模式课程start-------");
//        ACourse designPatternCourse = new DesignPatternCourse();
//        designPatternCourse.makeCourse();



        System.out.println("前段课程start-------");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程end-------");
    }
}
