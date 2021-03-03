package com.lti.test;

abstract class Vehicle{
	abstract void drive();
	public Vehicle(){
	System.out.println("Displaying Vehicle with no args constructor");
	}
}

 class Car extends Vehicle{
	void drive(){
	System.out.println("Car is driven from hyd to Chennai");
	}
	public Car(){
		System.out.println("Displaying Car with no args constructor");
	}
}

public class TestVehicle{
	public static void main(String[] args){
		Car car = new Car();
		car.drive();
		Bus bus = new Bus();
		bus.drive();
	}
}
