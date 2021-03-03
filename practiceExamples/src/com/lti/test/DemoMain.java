package com.lti.test;

public class DemoMain {

	public static void main(String[] args) {	
	
	Employee e =new Employee();
	e.rollno=68;//rollno can be accessed bcs its in same package
	            //bcs Employee class nd DemoMain are in same package
//	e.name="gdja";//->it doesn't compile,name->private
	 e.sal=5879.87;
	 e.age=25;
}
}
