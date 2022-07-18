package com.lxc.Facade;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class DVDPlayer {
    private  static  DVDPlayer instance = new DVDPlayer();
    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("dvd on");
    }

    public void off(){
        System.out.println("dvd off");
    }

    public void play(){
        System.out.println("dvd play");
    }

    public void pause(){
        System.out.println("dvd pause");
    }
}
