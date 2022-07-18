package com.lxc.decorator;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public abstract class Drink {
    public String des;
    private float price;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 子类实现
     * 计算价格
     * @return
     */
    public abstract float cost();
}
