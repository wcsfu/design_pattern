package com.rui.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
//        //Course 不是Boss的朋友，违背了迪米特法则
//        List<Course> courseList = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            courseList.add(new Course());
//        }
        teamLeader.checkNumberOfCourses();
    }
}
