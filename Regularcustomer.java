
public class Regularcustomer extends Customer {
	String customerID;
	String customerName;
	String customerType;
	double amt;
	
	Regularcustomer(String custID,String custName,String custType,double amount ){
		super(custID,custName,custType);
		this.customerID=custID;
		this.customerName=custName;
		this.customerType=custName;
		this.amt=amount;
		
	
	}
	double get_final_amount(double interst,int year) {
		double simple_interst=this.amt*interst*year;
		double amt=this.amt+simple_interst;
		
		if(this.customerType=="Domestic") {
			return amt-500;
		}
		else if (this.customerType=="Business") {
			return amt;
		}
		return amt;
		
	}
	

}
