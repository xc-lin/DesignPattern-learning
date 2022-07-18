package com.lxc.visitor;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
