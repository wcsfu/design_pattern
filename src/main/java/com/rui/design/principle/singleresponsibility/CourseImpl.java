package com.rui.design.principle.singleresponsibility;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class CourseImpl implements ICourseContent, ICourseManager {


    @Override
    public String getCoursename() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
