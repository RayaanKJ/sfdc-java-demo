package com.capgemini.sfdc.day2;

public class CalcDemo {

	public static void printNum() {
		System.out.println("10");
	}
	 
	public static void printSum(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public static int returnNum() {
		return(10);
		
	}
	
	public static int returnSum(int a,int b) {
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		printNum();
		printSum(10,5);
		System.out.println(returnNum());
		System.out.println(returnSum(10,12));
		
			
	}
}
