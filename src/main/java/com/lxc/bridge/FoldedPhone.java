package com.lxc.bridge;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠");
    }
}
