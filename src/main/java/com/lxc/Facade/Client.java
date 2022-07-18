package com.lxc.Facade;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */

/**
 * 几个小功能聚合成一个大功能
 * 分层设计的时候，可以用外观模式
 * 设计一个更高层的模块，来组合使用子系统
 */
public class Client {
    public static void main(String[] args) {
        // 直接调用很麻烦
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();

        homeTheaterFacade.pause();

    }
}
