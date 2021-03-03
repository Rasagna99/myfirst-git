package com.lti.test;

//Lambda expression only works with functional interface

interface Cab{//When an interface have exactly only 1 abstract method->Functional interface
	void bookCab();//by default its public abstract void bookCab();
	
	
}
//class Uber implements Cab{
//
//	public void bookCab() {
//		System.out.println("Uber booked!! Arriving Soon!!");
//	}
	
//}

public class LambdaExpressionEx {
	public static void main(String[] args) {
		//1.
//		Cab cab = new Uber();//Polymorphic statement
//		cab.bookCab();
		
		//2.Using anonymous class
	/*	Cab cab =new Cab() { //anonymous class
			public void bookCab() {
				System.out.println("Uber booked!! Arriving Soon!!");
			}	
		};
		cab.bookCab();
		*/
		//3.Using Lambda Expression with no input and no return type
		Cab cab = ()->{
			System.out.println("Uber booked!! Arriving Soon!!");
		};
		cab.bookCab();
	}

}
