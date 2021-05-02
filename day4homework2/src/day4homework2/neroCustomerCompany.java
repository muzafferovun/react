package day4homework2;

public class neroCustomerCompany extends CustomerCompany implements CustomerCompanyInterface,StarInterface {

	neroCustomerCompany(int id, String companyName) {
		super(id, companyName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkCustomer( Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void giveStar(Customer customer, Product product) {
		// TODO Auto-generated method stub
		
	}

}
