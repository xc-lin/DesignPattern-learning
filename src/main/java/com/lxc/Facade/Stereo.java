package com.lxc.Facade;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Stereo {
    private  static Stereo instance = new Stereo();
    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("stereo on");
    }

    public void off(){
        System.out.println("stereo off");
    }

    public void up(){
        System.out.println("popCron up");
    }

}
