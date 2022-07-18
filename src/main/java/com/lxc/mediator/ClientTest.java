package com.lxc.mediator;

public class ClientTest {

	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		
		Alarm alarm = new Alarm(mediator, "alarm");
		
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
				"coffeeMachine");
		
		Curtains curtains = new Curtains(mediator, "curtains");
		TV tV = new TV(mediator, "TV");
		
		//�����ӷ�����Ϣ
		alarm.SendAlarm(0);
		coffeeMachine.FinishCoffee();
		alarm.SendAlarm(1);
	}

}
