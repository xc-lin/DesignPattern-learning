package com.lxc.template.improve;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class PureSoyMilk extends SoyMilk{
    @Override
    void addCondiments() {
        // 空实现
    }

    @Override
    boolean customWantCondiments() {
        return false;
    }
}
