package com.google.yash;

import com.google.yash.*;
import com.google.yash.Cart;
import com.google.yash.Cart.Discount;
import com.google.yash.Cart.Tax;

public class Demo2 {

	public static void main(String[] args) {
		User user = new User();
		
//		// === init static nested class
		Tax tax = new Cart.Tax("someTaxType", 0);
//		
//		// === init inner class
		Discount discount = new Cart().new Discount("firstClientDiscount", 0);
		
		// === Abstract class demo
//		Product product = new Product(); // can't create instance of an abstract class
		MasterProduct masterProduct = new MasterProduct();
		VariantProduct variantProduct = new VariantProduct();
		
		masterProduct.setName("Mercedes S-klass");
		//((Object) variantProduct).setDeliveryAvailable(true);
		
		// === Anonymous class demo
		Product product = new Product() {
			public boolean isAvailableInStock() {
				return false;
			}
		};
		
	}
}
