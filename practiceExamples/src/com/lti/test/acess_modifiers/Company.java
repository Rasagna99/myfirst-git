package com.lti.test.acess_modifiers;

import com.lti.test.Employee;

public class Company {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.rollno=102;
		//e.name="ghjbs";->name is private->accessed with class only/-
		//e.sal=5687.46;->Sal is Protected->can't access in another main class
		//e.age=12;->age is default->access within package only
	}
}
