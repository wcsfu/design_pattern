package com.rui.design.principle.dependenceinversion;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class Geely {
    private ICourse iCourse;

    public Geely(ICourse iCourse) {
        this.iCourse = iCourse;
    }
//
//    public void studyImoocCourse(ICourse iCourse){
//        iCourse.studyCourse();
//    }
    public void studyImoocCourse(){
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}