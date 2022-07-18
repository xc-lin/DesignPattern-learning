package com.lxc.bridge;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("小米open");
    }

    @Override
    public void close() {
        System.out.println("小米close");
    }

    @Override
    public void call() {
        System.out.println("小米call");
    }
}
