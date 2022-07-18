package com.lxc.strategy;

/**
 * @author Frank_lin
 * @date 2022/7/18
 */
public abstract class Duck {
    public Duck() {
    }

    public abstract void display();
    public void quack(){
        System.out.println("嘎嘎叫");
    }
    public void swim(){
        System.out.println("游泳");
    }

    public void fly(){
        System.out.println("鸭子会飞翔");
    }



}
