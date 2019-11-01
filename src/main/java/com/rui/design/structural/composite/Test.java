package com.rui.design.structural.composite;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class Test {

    public static void main(String[] args) {

        CatelogComponent javaCourseCatelog = new CourseCatalog("Java课程目录", 2);
        CatelogComponent mmallCaourse1 = new Course("Java电商一期", 55);
        CatelogComponent mmallCaourse2 = new Course("Java电商二期", 66);
        CatelogComponent designPattern = new Course("java赊借模式", 77);

        javaCourseCatelog.add(mmallCaourse1);
        javaCourseCatelog.add(mmallCaourse2);
        javaCourseCatelog.add(designPattern);

        CatelogComponent imoocMainCourseCatelog = new CourseCatalog("慕课网课程主目录", 1);
        CatelogComponent linuxCourse = new Course("Linux课程", 11);
        CatelogComponent windowCourse = new Course("Windows课程", 11);

        imoocMainCourseCatelog.add(linuxCourse);
        imoocMainCourseCatelog.add(windowCourse);
        imoocMainCourseCatelog.add(javaCourseCatelog);
        imoocMainCourseCatelog.print();


    }
}
