package com.lxc.strategy.improve;

/**
 * @author Frank_lin
 * @date 2022/7/18
 */
public abstract class Duck {
    protected   FlyBehavior flyBehavior;
    // 其他属性


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
        if (flyBehavior!=null){
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
