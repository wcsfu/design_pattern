package com.rui.design.creational.prototype.clone;

import java.util.Date;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩琦", birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(6666666666L);

        System.out.println(pig1);
        System.out.println(pig2);

    }
}
