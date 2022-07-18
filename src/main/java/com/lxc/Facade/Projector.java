package com.lxc.Facade;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Projector {
    private  static Projector instance = new Projector();
    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("projector on");
    }

    public void off(){
        System.out.println("projector off");
    }

    public void play(){
        System.out.println("projector play");
    }

    public void focus(){
        System.out.println("projector focus");
    }
}
