package com.rui.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class EmployeeFactory {

    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        //享元模式的核心逻辑（共享）
        if (manager == null) {
            manager = new Manager(department);
            System.out.print("创建部门经理" + department);
            String reportContent = department+ "部门汇报：此次汇报的主要内容是.......";
            manager.setReportContetn(reportContent);
            System.out.println("创建报告："+reportContent);
            EMPLOYEE_MAP.put(department, manager);

        }
        return manager;
    }

}
