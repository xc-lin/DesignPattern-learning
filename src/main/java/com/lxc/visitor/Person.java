package com.lxc.visitor;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public abstract class Person {
    public abstract void accept(Action action);
}
