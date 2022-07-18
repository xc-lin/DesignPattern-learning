package com.lxc.singleton.lazy;

/**
 * @author Frank_lin
 * @date 2022/7/15
 */
public class LazyDoubleCheck {

    private static volatile LazyDoubleCheck instance;

    private LazyDoubleCheck() {

    }

    public static LazyDoubleCheck getInstance(){
        if (instance==null){
            synchronized (LazyDoubleCheck.class){
                if (instance==null){
                    instance=new LazyDoubleCheck();
                }
            }
        }
        return instance;
    }
}
