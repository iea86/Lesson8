package by.epam.javabasic25.classes;

import java.util.ArrayList;
import java.util.List;


public class PaymentArray {
	
	private List<Payment> payments = new ArrayList<Payment>();
	
	
	public List<Payment> getPayment(){
		return payments;
		}
	
	public void add(Payment payment){
	payments.add(payment);
	}
	
	public Payment findByProduct(String product){   //   to check whether the product is already in the basket 
		for(Payment payment : payments)
			{
			if (payment.getProduct().equals(product)){
				System.out.println(product + " is already in the basket");
			}
			}
		return null;
		}
	
}

