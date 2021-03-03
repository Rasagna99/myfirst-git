package com.lti.test.acess_modifiers;

import com.lti.test.Employee;

public class Engineer extends Employee{
	
	public void show() {
		sal=563.46;//sal->protected-can be used in subclass of different package
		//age=24;->age->default->can't be used in other packages
	}

}
