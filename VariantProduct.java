package com.google.yash;

import com.google.yash.*;

public class VariantProduct extends Product {
	
	private MasterProduct[] variants;

	public boolean isAvailableInStock() {
		for (MasterProduct masterProduct : variants) {
			if (masterProduct.isAvailableInStock()) {
				return true;
			}
		}
		return false;
	}

}
