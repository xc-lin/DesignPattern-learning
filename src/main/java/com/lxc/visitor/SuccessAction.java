package com.lxc.visitor;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class SuccessAction extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是成功");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价是成功");
    }
}
