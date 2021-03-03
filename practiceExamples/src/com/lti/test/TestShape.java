package com.lti.test;

public class TestShape {
	public void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		c.rotate();
		Triangle t = new Triangle();
		t.draw();
		t.CalculatePerimeter();
		
	}
}
