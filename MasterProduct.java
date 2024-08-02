package com.google.yash;

public class MasterProduct extends Product {

	private boolean isAvailableForLease;

	public boolean isAvailableInStock() {
		return getRemainingAmountInStock() > 0;
	}

	private int getRemainingAmountInStock() {
		// TODO Auto-generated method stub
		return 0;
	}
}
