package com.lxc.prototype.improve;


public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//
		Sheep sheep = new Sheep("tom", 1, "白色");
		sheep.friend =new Sheep("jack",2,"黑色");
		
		Sheep sheep2 = (Sheep) sheep.clone();
		Sheep sheep3 = (Sheep) sheep.clone();
		Sheep sheep4 = (Sheep) sheep.clone();
		Sheep sheep5 = (Sheep) sheep.clone();
		sheep.setAge(3);

		//....
		
		System.out.println(sheep.toString()+sheep.friend.hashCode());
		System.out.println(sheep2.toString()+sheep.friend.hashCode());
		System.out.println(sheep3.toString()+sheep.friend.hashCode());
		System.out.println(sheep4.toString()+sheep.friend.hashCode());
		System.out.println(sheep5.toString()+sheep.friend.hashCode());
		//...
	}

}
