package com.lxc.template.improve;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("红豆");
        BlackBeanSoyMilk blackBeanSoyMilk = new BlackBeanSoyMilk();
        blackBeanSoyMilk.make();

        System.out.println("花生");
        PennutSoyMilk pennutSoyMilk = new PennutSoyMilk();
        pennutSoyMilk.make();

        System.out.println("纯豆浆");
        PureSoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();
    }
}
