package com.lxc.singleton.hungry;

/**
 * @author Frank_lin
 * @date 2022/7/15
 */
public class SingletonStatic2 {
    private static final SingletonStatic2 instance;

    static {
        instance = new SingletonStatic2();
    }

    private SingletonStatic2() {
    }

    public static SingletonStatic2 getInstance() {
        return instance;
    }
}

