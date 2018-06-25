package by.epam.javabasic25.classes;

	public class BankAccountL8 {
		
		private int AccountNumber;	
	    private String Currency;	
	    private double Total;
	
	
	public BankAccountL8(int AccountNumber, String Currency, double Total){
	
	    this.AccountNumber = AccountNumber;
	
	    this.Currency = Currency;
	
	    this.Total = Total;
	}

		public int getAccountNumber() {
			return AccountNumber;
		}
		
		public void setAccountNumber(int accountNumber) {
			AccountNumber = accountNumber;
		}
		
		public String getCurrency() {
			return Currency;
		}
		
		public void setCurrency(String currency) {
			Currency = currency;
		}
		
		public double getTotal() {
			return Total;
		}
		
		public void setTotal(double total) {
			Total = total;
		}

@Override
		public boolean equals(Object obj) {
		
		    if (this == obj)
		        return true;
		
		    if (obj == null)
		        return false;
		
		    if (getClass() != obj.getClass())
		        return false;		    
		
		    BankAccountL8 other = (BankAccountL8) obj;  
		
		    if (AccountNumber != other.AccountNumber)  ///to compare each attribute of the class
		        return false;
		
		    if (Total != other.Total)
		        return false;
		
		    if (Currency != other.Currency)
		        return false;
		
		    return true;		
		}


@Override
public int hashCode() {

    final int prime = 31;
    int result = 1;

    result = prime * result + AccountNumber;
    result = prime * result + (int)Total;
    result = prime * result + ((Currency == null) ? 0 : Currency.hashCode());
    
    return result;

}

@Override
public String toString(){

    return ("Bank Account: " + getAccountNumber() + ", Total: " + getTotal() + " " + getCurrency());

  }

}