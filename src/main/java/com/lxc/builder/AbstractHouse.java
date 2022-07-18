package com.lxc.builder;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public abstract class AbstractHouse {

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }

}
