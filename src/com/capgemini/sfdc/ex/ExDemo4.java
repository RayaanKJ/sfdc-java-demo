package com.capgemini.sfdc.ex;

import java.util.Scanner;

public class ExDemo4 {
	
	public static void checkPin(int pin) {
		int atmpin = 1212;
		if(pin==atmpin) {
			System.out.println("Correct pin");
		}
		else {
			throw new IncorrectpinException("You have entered the wrong pin");
		}
	}

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your ATM Pin");
	int pin1=sc.nextInt();
	
	try {
	ExDemo4.checkPin(pin1);
	}
	catch(IncorrectpinException x) {
		
		System.out.println(x.getMessage());
	}
	}
	}

