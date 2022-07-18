package com.lxc.Facade;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Screen {
    private  static Screen instance = new Screen();
    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("screen on");
    }

    public void down(){
        System.out.println("projector off");
    }


}
