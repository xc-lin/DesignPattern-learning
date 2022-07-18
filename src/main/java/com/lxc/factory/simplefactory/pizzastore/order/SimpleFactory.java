package com.lxc.factory.simplefactory.pizzastore.order;


import com.lxc.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.lxc.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.lxc.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.lxc.factory.simplefactory.pizzastore.pizza.Pizza;

// 简单工厂类
public class SimpleFactory {

    //
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("芝士披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }

    // 简单工厂模式也叫静态工厂模式

    public static Pizza createPizza2(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("芝士披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }

}
