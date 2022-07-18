package com.lxc.decorator;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return this.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + drink.getDes();
    }
}
