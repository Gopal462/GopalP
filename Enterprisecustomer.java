
public class Enterprisecustomer extends Customer {
	String customerID;
	String customerName;
	String customerType;
	double amt;
	
	Enterprisecustomer(String custID,String custName,String custType,double amount ){
		super(custID,custName,custType);
		this.customerID=custID;
		this.customerName=custName;
		this.customerType=custName;
		this.amt=amount;
		
	
	}
	double get_final_amount(double interst,int year) {
		double simple_interst=this.amt*interst*year;
		double amt=this.amt+simple_interst;
		
		amt=amt-500;
		if(this.customerType=="Smallscale") {
			return amt-100;
		}
		else if (this.customerType=="Largescale") {
			return amt;
		}
		return amt;
		
	}
	

}


