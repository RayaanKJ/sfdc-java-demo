package com.capgemini.sfdc.oops;

interface SomeInterface {

}

interface StateGovt {

}

interface GovtOfIndia {

	void paySalaries();

}

abstract class Rbi {

	abstract void doKyc();

//	void doKyc2() {
//		// code - aadhaar, pan, voter
//	}
	

	public void paySalaries() {
		// TODO Auto-generated method stub

	}

}

class HdfcBank extends Rbi implements GovtOfIndia, StateGovt {

	@Override
	void doKyc() {
		// specify the process 
	}

	void giveLoans() {
		// code
	}

	void takeDeposits() {
		// code
	}

	public void paySalaries() {
		// TODO Auto-generated method stub

	}
	
	void payInterest() {
		// different implementation
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		HdfcBank obj = new HdfcBank();
		obj.giveLoans();
		obj.takeDeposits();
		obj.doKyc();
	}
	
}
