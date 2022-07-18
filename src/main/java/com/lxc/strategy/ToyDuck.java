package com.lxc.strategy;

/**
 * @author Frank_lin
 * @date 2022/7/18
 */
public class ToyDuck extends Duck{
    @Override
    public void display() {
        System.out.println("玩具鸭子");
    }

    @Override
    public void fly() {
        System.out.println("不能飞翔");
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
