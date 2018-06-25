package by.epam.javabasic25.classes;

import java.util.Date;

public class Payment {
	
	private String Product;
	private Date data;
	
	public Payment(String Product, Date data){
	this.Product = Product;
	this.data = data;
	}
	
	
	
	public String getProduct() {
		return Product;
	}



	public void setProduct(String product) {
		Product = product;
	}



	public Date getData() {
		return data;
	}



	public void setData(Date data) {
		this.data = data;
	}



	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((data == null) ? 0 : data.hashCode());
	result = prime * result + ((Product == null) ? 0 : Product.hashCode());
	return result;
	}
	
	@Override
	public boolean equals(Object obj) {
	if (this == obj) return true;
	
	if (obj == null) return false;
	
	if (getClass() != obj.getClass()) return false;
	
	Payment other = (Payment) obj;
	if (data == null) {
	if (other.data != null) return false;
	
	} else if (!data.equals(other.data)) return false;
	
	if (Product == null) {
	if (other.Product != null) return false;
	} else if (!Product.equals(other.Product)) return false;
	return true;
	}
	
	

	
}
	
	
