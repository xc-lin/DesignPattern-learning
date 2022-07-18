package com.lxc.builder.improve;

import com.lxc.builder.improve.House;
import com.lxc.builder.improve.HouseBuilder;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
// 指挥者 如果和建造房子的流程交给建造者
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House construct(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
