package com.lxc.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import com.lxc.factory.simplefactory.pizzastore.pizza.Pizza;

public class  OrderPizza {

	// 构造器
//	public OrderPizza() {
//		Pizza pizza = null;
//		String orderType;
//		do {
//			orderType = getType();
//			if (orderType.equals("greek")) {
//				pizza = new GreekPizza();
//				pizza.setName("希腊披萨");
//			} else if (orderType.equals("cheese")) {
//				pizza = new CheesePizza();
//				pizza.setName("芝士披萨");
//			} else if (orderType.equals("pepper")) {
//				pizza = new PepperPizza();
//				pizza.setName("胡椒披萨");
//			} else {
//				break;
//			}
//
//			pizza.prepare();
//			pizza.bake();
//			pizza.cut();
//			pizza.box();
//			
//		} while (true);
//	}

	// 定义一个简单工厂对象
	SimpleFactory simpleFactory;
	Pizza pizza = null;
	
	//������
	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	
	public void setFactory(SimpleFactory simpleFactory) {
		// 用户输入的
		String orderType = "";
		
		this.simpleFactory = simpleFactory;
		
		do {
			orderType = getType(); 
			pizza = this.simpleFactory.createPizza(orderType);
			
			// 输出pizza
			if(pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("订购pizza失败");
				break;
			}
		}while(true);
	}
	
	// 客户希望订购的披萨种类
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza type: ");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
