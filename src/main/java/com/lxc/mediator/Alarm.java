package com.lxc.mediator;

public class Alarm extends Colleague {

	//������
	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		// TODO Auto-generated constructor stub
		// 在创建Alarm对象时，将自己放入到ConcreteMediator
		mediator.Register(name, this);
	}

	public void SendAlarm(int stateChange) {
		SendMessage(stateChange);
	}

	@Override
	public void SendMessage(int stateChange) {
		// TODO Auto-generated method stub
		// 调用中介者
		this.GetMediator().GetMessage(stateChange, this.name);
	}

}
