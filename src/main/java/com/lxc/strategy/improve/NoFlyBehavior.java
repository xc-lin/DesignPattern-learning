package com.lxc.strategy.improve;

/**
 * @author Frank_lin
 * @date 2022/7/18
 */
public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不会飞翔");
    }
}
