package com.lxc.prototype.improve;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    public Sheep friend;
    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // 克隆该实例，使用默认的clone 方法来完成
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep =null;
        sheep = (Sheep) super.clone();
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep [name=" + name + ", age=" + age + ", color=" + color + "]";
    }

}
