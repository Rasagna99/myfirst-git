package com.lti.test;

interface Shape{
	void draw();
}
public class Circle implements Shape{

	public void draw() {
		System.out.println("Drawing a Circle");
	}
	void rotate() {
		System.out.println("Rotating a Circle by 90`");
	}
}
class Triangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Drawing a Triangle");
	}
	void CalculatePerimeter() {
		System.out.println("Perimeter of Triangle is a+b+c");
	}

	
}
