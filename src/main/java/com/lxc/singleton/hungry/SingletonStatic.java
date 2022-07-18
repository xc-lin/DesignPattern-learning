package com.lxc.singleton.hungry;

/**
 * @author Frank_lin
 * @date 2022/7/15
 */
public class SingletonStatic {
    private static  final  SingletonStatic  instance  = new SingletonStatic();

    private SingletonStatic() {
    }

    public static SingletonStatic getInstance(){
        return instance;
    }
}

