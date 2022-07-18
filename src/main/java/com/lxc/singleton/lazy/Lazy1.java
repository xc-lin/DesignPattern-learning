package com.lxc.singleton.lazy;

/**
 * @author Frank_lin
 * @date 2022/7/15
 */
public class Lazy1 {
    private static Lazy1 instance;

    private Lazy1() {
    }

    public static Lazy1 getInstance() {
        if (instance == null) {
            instance = new Lazy1();
        }
        return instance;
    }
}
