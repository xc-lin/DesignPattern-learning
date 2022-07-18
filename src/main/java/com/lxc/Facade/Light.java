package com.lxc.Facade;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Light {
    private static Light instance = new Light();

    public static Light getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("light on");
    }

    public void off() {
        System.out.println("light off");
    }

    public void dim() {
        System.out.println("light dim");
    }

    public void bright() {
        System.out.println("light bright");
    }
}
