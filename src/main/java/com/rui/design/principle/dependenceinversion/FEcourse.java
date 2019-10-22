package com.rui.design.principle.dependenceinversion;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class FEcourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习前端课程");
    }
}
