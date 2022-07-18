package com.lxc.visitor;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public abstract class Action {
    // 得到男性的测评
    public abstract void getManResult(Man man);

    // 得到女性的测评
    public abstract void getWomanResult(Woman woman);
}
