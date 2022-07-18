package com.lxc.builder.improve;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public House buildHouse() {
        return house;
    }

}
