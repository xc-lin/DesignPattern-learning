package com.lxc.builder.improve;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class House {
    private String base;
    private String walls;
    private String roofed;

    @Override
    public String toString() {
        return "House{" +
                "base='" + base + '\'' +
                ", walls='" + walls + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
