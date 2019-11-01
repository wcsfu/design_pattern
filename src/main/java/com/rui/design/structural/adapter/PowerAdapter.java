package com.rui.design.structural.adapter;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        //模拟变压
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC：" + adapterInput + "V" + " 输出DC：" + adapterOutput + "V");
        return adapterOutput;
    }
}
