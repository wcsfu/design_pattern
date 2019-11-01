package com.rui.design.behavioral.mediator;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class Test {
    public static void main(String[] args) {
        User geely =new User("Geely");
        User tom =new User("Tom");
        geely.sendMessage("Hey Tom ! let's learn Design pattern");
        tom.sendMessage("Oke Geely");
    }
}
