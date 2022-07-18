package com.lxc.Facade;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class PopCorn {
    private  static PopCorn instance = new PopCorn();
    public static PopCorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("popCron on");
    }

    public void off(){
        System.out.println("popCron off");
    }

    public void play(){
        System.out.println("popCron play");
    }

    public void pause(){
        System.out.println("popCron pause");
    }
}
