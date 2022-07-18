package com.lxc.strategy.improve;

/**
 * @author Frank_lin
 * @date 2022/7/18
 */
public class PekingDuck extends Duck {

    public PekingDuck(){
        super.flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("北京鸭");
    }




}
