package com.rui.design.structural.flyweight;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class Manager implements Employee {
    private String department;
    private String reportContetn;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContetn(String reportContetn) {
        this.reportContetn = reportContetn;
    }

    @Override
    public void report() {
        System.out.println(reportContetn);
    }
}
