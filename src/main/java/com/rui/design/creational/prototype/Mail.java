package com.rui.design.creational.prototype;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述  目标类实现clone接口实现克隆
 */
public class Mail implements Cloneable{

    private String name;
    private String emailAddress;
    private String content;

    public Mail() {
        System.out.println("Mail Class Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}'+super.toString();
    }
}
