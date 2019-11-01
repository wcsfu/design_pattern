package com.rui.design.behavioral.mediator;


import java.util.Date;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class StudyGroup {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()+" ["+user.getName()+": "+message+" ]");
    }
}
