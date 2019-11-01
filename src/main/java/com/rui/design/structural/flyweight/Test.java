package com.rui.design.structural.flyweight;


/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class Test {

    private static final String deparments[] = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String deparment = deparments[(int) (Math.random() * deparments.length)];
            Manager manager= (Manager) EmployeeFactory.getManager(deparment);
            manager.report();
        }
    }
}
