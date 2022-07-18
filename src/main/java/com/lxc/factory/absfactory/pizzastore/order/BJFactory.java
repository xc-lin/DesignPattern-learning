package com.lxc.factory.absfactory.pizzastore.order;

import com.lxc.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.lxc.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.lxc.factory.absfactory.pizzastore.pizza.Pizza;

//���ǹ�������
public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~ʹ�õ��ǳ��󹤳�ģʽ~");
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")){
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
