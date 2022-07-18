package com.lxc.decorator;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */

/**
 * 这里就是调味品
 */
public class Soy extends Decorator{

    public Soy(Drink drink) {
        super(drink);
        setDes("豆奶");
        setPrice(1.5f);
    }





}
