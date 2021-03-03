package com.lti.test;

interface Bus1{
	//	void bookBus(String source,String destination);
	double bookBus(String source,String destination); //with return type
}

public class LamdaWithParams {

	public static void main(String[] args) {
		
	Bus1 bus = (source,destination) -> { //2parameters
		System.out.println("Bus booked from "+source+ " to " +destination);
		System.out.println("Arriving Soon!!");
		return 1200.57;
	};
	//bus.bookBus("Hyderabad", "Chennai");
	double fare=bus.bookBus("Hyderabad", "Chennai");
	System.out.println("Fare shall be: "+fare);
	}
}
