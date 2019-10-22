package com.rui.design.principle.dependenceinversion;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class Test {
    /**
     * 直接修改实现类
     * @param args
     */
//    public static void main(String[] args) {
//        Geely geely=new Geely();
//        geely.studyFECourse();
//        geely.studyJavaCourse();
//    }

    /**
     * 通过接口，扩展实现类(接口方法注入)
     * @param args
    //     */
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyImoocCourse(new JavaCourse());
//        geely.studyImoocCourse(new FEcourse());
//    }

    /**
     * 构造注入的方式
     * @param args
     */
//    public static void main(String[] args) {
//        Geely geely=new Geely(new PythonCourse());
//        geely.studyImoocCourse();
//    }

    /**
     * setter注入的方式
     *
     * @param args
     */
    public static void main(String[] args) {
        Geely geely = new Geely(new PythonCourse());
        geely.setiCourse(new FEcourse());
        geely.studyImoocCourse();
    }


}
