package com.lxc.Observer.improve;

public class Client {
	public static void main(String[] args) {
		CurrentConditions currentConditions = new CurrentConditions();
		Baidu baidu = new Baidu();
		WeatherData weatherData = new WeatherData();
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(baidu);
		weatherData.setData(30, 150, 40);

		weatherData.remove(baidu);
		System.out.println("=========================");
		weatherData.setData(40, 160, 20);
		
	}
}
