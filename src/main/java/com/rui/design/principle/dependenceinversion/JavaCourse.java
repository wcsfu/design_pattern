package com.rui.design.principle.dependenceinversion;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Geely在学习java课程");

    }
}
