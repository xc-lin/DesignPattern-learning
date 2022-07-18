package com.lxc.decorator;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */

/**
 * 这里就是调味品
 */
public class Milk extends Decorator{

    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(2.0f);
    }





}
