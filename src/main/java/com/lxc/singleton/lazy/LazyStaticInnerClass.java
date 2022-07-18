package com.lxc.singleton.lazy;

/**
 * @author Frank_lin
 * @date 2022/7/15
 */
public class LazyStaticInnerClass {

    private static LazyStaticInnerClass instance;


    private LazyStaticInnerClass() {
    }


    private static class SingletonInstance {
        private static final SingletonInstance instance = new SingletonInstance();
    }

    public SingletonInstance getInstance(){
        return SingletonInstance.instance;
    }

}
