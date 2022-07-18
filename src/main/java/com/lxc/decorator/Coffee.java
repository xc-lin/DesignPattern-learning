package com.lxc.decorator;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
