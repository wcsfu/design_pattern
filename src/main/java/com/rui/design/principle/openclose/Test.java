package com.rui.design.principle.openclose;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "Java从零到企业级电商开发", 348d);
        JavaDiscountCourse javaCourse=(JavaDiscountCourse)iCourse;
        //System.out.println在实际项目中是禁止的，因为有锁
        System.out.println("课程ID：" + javaCourse.getId() + "课程名称：" + javaCourse.getName() + " 课程原价："+javaCourse.getOriginPrice()+"课程价格：" + javaCourse.getPrice()+"元");
        System.out.println(javaCourse.getOriginPrice());

    }
}
