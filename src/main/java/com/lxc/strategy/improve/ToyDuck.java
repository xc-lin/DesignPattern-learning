package com.lxc.strategy.improve;

/**
 * @author Frank_lin
 * @date 2022/7/18
 */
public class ToyDuck extends Duck {
    public ToyDuck(){
        super.flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭子");
    }


    @Override
    public void swim() {
        System.out.println("不会游泳");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭子不会叫");
    }
}
