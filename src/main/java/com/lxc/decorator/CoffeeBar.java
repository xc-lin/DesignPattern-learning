package com.lxc.decorator;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class CoffeeBar {
    public static void main(String[] args) {
        Drink longBlack = new LongBlack();

        System.out.println(longBlack.cost());
        // 加入一份牛奶
        Drink milk = new Milk(longBlack);
        System.out.println(milk.cost());

        Drink chocolate = new Chocolate(milk);
        System.out.println(chocolate.cost());

        Drink chocolate2 = new Chocolate(chocolate);
        System.out.println(chocolate2.cost());

    }
}
