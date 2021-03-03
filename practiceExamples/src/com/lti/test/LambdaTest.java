package com.lti.test;

interface SquareOfNum{
	public int square(int n);
}
public class LambdaTest {
	public static void main(String[] args) {
		
		SquareOfNum s1 = n -> n*n;
		SquareOfNum s2 = (n) -> n*n;
		SquareOfNum s3 = (n) -> {return n*n;};
		
//		SquareOfNum s4 = n -> {n*n;}; 
//		SquareOfNum s5 = (n) -> {return n*n;}
//		SquareOfNum s = (n) -> return n*n; ->Illegal start
		
		System.out.println("Square of 4 is: "+s1.square(4));
		System.out.println("Square of 4 is: "+s2.square(4));
		System.out.println("Square of 4 is: "+s3.square(4));
	}
}
