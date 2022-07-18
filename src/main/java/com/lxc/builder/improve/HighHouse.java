package com.lxc.builder.improve;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class HighHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("给高楼房子打地基");
        house.setBase("");
    }

    @Override
    public void buildWalls() {
        System.out.println("给高楼房子砌墙");

    }

    @Override
    public void roofed() {
        System.out.println("给高楼房子封顶");
    }
}
