package com.rui.design.principle.liskovsubsitution;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class Test {

    public static void resize(Quadrangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
           // rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width: " + rectangle.getWidth() + " length: " + rectangle.getLength());
        }
        System.out.println("resize方法结束" + rectangle.getWidth() + " length: " + rectangle.getLength());
    }

//    public static void main(String[] args) {
//        Rectangle rectangle=new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);
//    }

    public static void main(String[] args) {
        Square square=new Square();
       // square.setLength(20);
        resize(square);
    }
}
