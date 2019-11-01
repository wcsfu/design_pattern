package com.rui.design.behavioral.oberver;

import java.util.Observable;
import java.util.Observer;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */

//观察者
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course)o;
        Question question=(Question) arg;
        System.out.println(teacherName+"老师的"+course.getCourseName()+"课程接收到一个"+question.getUserName()+"提交的问答"+question.getQuestionContent());
    }
}
