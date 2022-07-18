package com.lxc.bridge;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public abstract class Phone implements Brand{

    private Brand brand;

    public Phone(Brand brand){
        this.brand =brand;
    }

    @Override
    public void open() {
        this.brand.open();
    }

    @Override
    public void close() {
        this.brand.close();
    }

    @Override
    public void call() {
        this.brand.call();
    }
}
