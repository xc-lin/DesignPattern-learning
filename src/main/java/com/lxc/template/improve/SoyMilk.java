package com.lxc.template.improve;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public abstract class SoyMilk {
    // 模版方法，make 模版方法可以做成final 不让子类去覆盖
    final void make() {
        select();
        if (customWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    void select() {
        System.out.println("select");
    }

    abstract void addCondiments();

    void soak() {
        System.out.println("soak");
    }

    void beat() {
        System.out.println("beat");
    }

    // 钩子方法

    boolean customWantCondiments() {
        return true;
    }
}
