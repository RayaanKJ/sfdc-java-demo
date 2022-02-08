package com.capgemini.sfdc.oops;

class Parent {
	int num;
}

class Child extends Parent {
	int num2;
}


public class InheritDemo {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.num2 = 20;
		System.out.println(ch.num2);
		ch.num = 10;
		System.out.println(ch.num);
	}
	
}
