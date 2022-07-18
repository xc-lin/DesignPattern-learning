package com.lxc.builder;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Client {
    public static void main(String[] args) {
        AbstractHouse house = new CommonHouse();
        house.build();
    }
}
