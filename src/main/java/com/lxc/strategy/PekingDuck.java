package com.lxc.strategy;

/**
 * @author Frank_lin
 * @date 2022/7/18
 */
public class PekingDuck extends Duck{
    @Override
    public void display() {
        System.out.println("北京鸭");
    }

    @Override
    public void fly() {
        System.out.println("不能飞翔");
    }


}
