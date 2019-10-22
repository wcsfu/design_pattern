package com.rui.design.principle.singleresponsibility;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public interface ICourse {

    /**
     * 以下两个方式是获取课程信息
     * @return
     */
    String getCoursename();
    byte[] getCourseVideo();

    /**
     * 以下两个方式是课程的管理
     */
    void studyCourse();
    void refundCourse();


    //将接口按照上面的功能进行拆分
}
