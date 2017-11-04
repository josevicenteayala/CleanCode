package com.intergrupo.cleancode.comments;

public class Comments {

	
	/**
	 * this method do an unnecessary comparison and obligated to explain the purpose
	 * @param customer, customer to evaluate
	 */
	public void messMethod(Customer customer) {
		
		//it compare if the customer have some clasification an then if is possible to trust him
		if(customer.isCustomerAlreadyClasified && customer.validateTheClasificationCustomer(Customer.PAPER_CUSTOMER)) {
			System.out.println("please, say good by to the customer");
		}
	}
	
	/**
	 * This method have a good and clarified sentence
	 * @param customer
	 */
	public void clearMethod(Customer customer) {
		// do not need comments at all - this is only for academic purpose
		if(customer.isAPaperCustomer()) {
			System.out.println("please, say good by to the customer");
		}		
	}
	
}

class Customer{
	public static final int GOLD_CUSTOMER = 1;
	public static final int SILVER_CUSTOMER = 2;
	public static final int PAPER_CUSTOMER = 3;
	
	private int[] customerClasificationList;
	
	public boolean isCustomerAlreadyClasified;
	
	public Customer(int ... kindOfCustomer) {
		customerClasificationList = kindOfCustomer;
		if(customerClasificationList != null && customerClasificationList.length > 0) {
			isCustomerAlreadyClasified = true;
		}
	}
	
	public boolean validateTheClasificationCustomer(int kindOfCustomer) {
		for (int i = 0; i < customerClasificationList.length; i++) {
			if(customerClasificationList[i] == kindOfCustomer) {
				return true;	
			}
		}
		return false;
	}
	
	public boolean isAPaperCustomer() {
		if(customerClasificationList != null && customerClasificationList.length > 0) {
			for (int i = 0; i < customerClasificationList.length; i++) {
				if(customerClasificationList[i] == PAPER_CUSTOMER) {
					return true;	
				}
			}
		}
		return false;		
	}
}