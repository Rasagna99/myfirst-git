package com.lti.test;

class Parent { 
	int value = 1000; 
} 
class Child extends Parent { 
	int value = 10; 
} 
  
public class Test {
	public static void main(String[] args) 
    { 
		Child cobj = new Child();
        Parent pobj = new Parent(); 
        
        System.out.println(pobj instanceof Child) ;
        System.out.println(cobj instanceof Child);
        System.out.println(cobj instanceof Parent);
        System.out.println(cobj instanceof Object);
        System.out.println(pobj instanceof Object);
        
        Child cobj1 = null; //
        System.out.println(cobj1 instanceof Child);
        System.out.println(cobj1 instanceof Parent);
        System.out.println(cobj1 instanceof Object);
       
        Parent cobj2 = new Child(); //reference Parent, object is Child 
        System.out.println(cobj2 instanceof Child);
        System.out.println(cobj2 instanceof Parent);
        System.out.println(cobj2 instanceof Object);
        
        Parent cobj3 = new Child(); 
        Parent par = cobj3; 
        System.out.println(par instanceof Child);
        // Using instanceof to make sure that par 
        // is a valid reference before typecasting 
        if (par instanceof Child) 
        { 
            System.out.println("Value accessed through " + 
                "parent reference with typecasting is " + 
                                     ((Child)par).value); 
        }       
    }
}

