package com.lxc.strategy.improve;

/**
 * @author Frank_lin
 * @date 2022/7/18
 */

/**
 * 分析项目中，变化的部分和不变的部分
 * ocp原则，客户端增加行为不用变化原有代码，只需要增加一种策略
 * 避免了使用多重if else
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();


        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();
    }
}
