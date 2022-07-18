package com.lxc.Observer.improve;

/**
 * ��ʾ��ǰ�����������������������վ�Լ�����վ��
 * @author Administrator
 *
 */
public class Baidu implements Observer{
	private float temperature;
	private float pressure;
	private float humidity;


	@Override
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("***baidu Today mTemperature: " + temperature + "***");
		System.out.println("***baidu Today mPressure: " + pressure + "***");
		System.out.println("***baidu Today mHumidity: " + humidity + "***");
	}
}
