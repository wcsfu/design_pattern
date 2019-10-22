package com.rui.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class TeamLeader {

    public void checkNumberOfCourses(){

        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是："+courseList.size());
    }
}
