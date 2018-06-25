package by.epam.javabasic25.classes;

public class BankAccountL8Main {
	
	public static void main(String[] args) {
	
	BankAccountL8 Account1 = new BankAccountL8(567349, "USD",25000);
	BankAccountL8 Account2 = new BankAccountL8(567350, "EUR",34700);
	BankAccountL8 Account3 = new BankAccountL8(567361, "RUB",134000);
	BankAccountL8 Account4 = new BankAccountL8(567374, "USD",25000);	
	
	System.out.println(Account1);
	System.out.println(Account2);
	System.out.println(Account3);
	System.out.println(Account4);
	

	//compare via equals
		
	if(Account1.equals(Account2))
	    System.out.println("Account1 is equal to Account2");
	
	else
	    System.out.println("Account1 is not to equal to Account2");

	//compare via hashcode
	
	if(Account1.hashCode() == Account2.hashCode())
	    System.out.println("Account1 hashcode is equal to Account2 hashcode");
	
	else
	    System.out.println("Account1 hashcode is not equal to Account2 hashcode");  


   }
	
}

