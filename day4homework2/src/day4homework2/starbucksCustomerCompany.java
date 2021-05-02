package day4homework2;

public class starbucksCustomerCompany extends CustomerCompany implements CustomerCompanyInterface,StarInterface {

	starbucksCustomerCompany(int id, String companyName) {
		super(id, companyName);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean checkCustomer(Customer customer) {
		// TODO Auto-generated method stub
		if(customer.getDayOfBirth()!=""&&customer.getFirstName()!=""&&customer.getLastName()!=""&&customer.getNationaltyId().length()==11) 
		{
		return true;
		}
		else return false;
	}


	@Override
	public void giveStar(Customer customer, Product product) {
		// TODO Auto-generated method stub
		if(product.isCofee()) {
			customer.setStars(customer.getStars()+1);
		}
	}

}
