package com.brinda.javasamples;

public class TestM {
	
	int a;
	int b;
	
	TestM(){
		a = 100;
		b = 200;
	}
	
	void display(TestM obj)
	{
		System.out.println("a = " + obj.a + " b = " + obj.b);
	}
	
	void get() {
		display(this);
	}
	

}
