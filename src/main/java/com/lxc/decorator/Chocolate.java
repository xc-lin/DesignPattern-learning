package com.lxc.decorator;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */

/**
 * 这里就是调味品
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3.0f);
    }





}
