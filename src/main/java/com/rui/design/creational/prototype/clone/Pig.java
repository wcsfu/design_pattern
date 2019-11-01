package com.rui.design.creational.prototype.clone;

import java.util.Date;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class Pig implements Cloneable {
    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        //深克隆(对象属性需要实现单独的clone方法)
        pig.birthday = (Date) pig.birthday.clone();
        //一定要返回克隆的对象，否则不生效
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }
}
