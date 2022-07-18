package com.lxc.strategy.improve;

/**
 * @author Frank_lin
 * @date 2022/7/18
 */
public class WildDuck extends Duck {


    public WildDuck(){
        super.flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
