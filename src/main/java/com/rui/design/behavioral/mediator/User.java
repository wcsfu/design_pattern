package com.rui.design.behavioral.mediator;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        //用户只和中介者发消息
        StudyGroup.showMessage(this, message);
    }
}
