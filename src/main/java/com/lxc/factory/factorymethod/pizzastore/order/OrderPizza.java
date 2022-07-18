package com.lxc.factory.factorymethod.pizzastore.order;


import com.lxc.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;





public abstract class OrderPizza {

	//����һ�����󷽷���createPizza , �ø������������Լ�ʵ��
	abstract Pizza createPizza(String orderType);
	
	// ������
	public OrderPizza() {
		Pizza pizza = null;
		String orderType; // ��������������
		do {
			orderType = getType();
			pizza = createPizza(orderType); // 抽象方法，由工厂子类实现
			//���pizza ��������
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			
		} while (true);
	}

	

	// дһ�����������Ի�ȡ�ͻ�ϣ����������������
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza ����:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
