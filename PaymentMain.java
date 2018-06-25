package by.epam.javabasic25.classes;

import java.util.List;

import java.util.Date;

public class PaymentMain {
	
		public static void main(String[] args){
			
		PaymentArray myPayment = new PaymentArray(); 
		
		myPayment.add(new Payment("Product1", new Date(2018/01/01)));		
		myPayment.add(new Payment("Product2", new Date(2018/01/01)));
		myPayment.add(new Payment("Product3", new Date(2018/01/01)));
		
			
		print(myPayment);  ///to print collection
		
		
		Payment findPayment = myPayment.findByProduct("Product1");
		}
				
				
		public static void print(PaymentArray paymentarray){
			List<Payment> printNotes = paymentarray.getPayment();
			
			for(int i=0; i<printNotes.size(); i++){
			Payment note = printNotes.get(i);
			print(note);
			}
		}
		
		public static void print(Payment payment){
			System.out.println("Payment : " + payment.getProduct() + ";  " + "Date: " + payment.getData());
}

}

