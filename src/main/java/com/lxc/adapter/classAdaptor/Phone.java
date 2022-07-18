package com.lxc.adapter.classAdaptor;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Phone {
    public void charging (Voltage5V voltage5V){
        if (voltage5V.output5V()==5){
            System.out.println("可以充电");
        }else {
            System.out.println("不能充电");
        }
    }
}
