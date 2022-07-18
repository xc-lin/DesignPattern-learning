package com.lxc.builder.improve;



/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Client {
    public static void main(String[] args) {
        HouseBuilder house = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(house);
        // 完成盖房子
        House construct = houseDirector.construct();
        System.out.println(construct);
    }
}
