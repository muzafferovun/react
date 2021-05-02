package day4homework2;

public class StarStarbucks implements StarInterface {

	@Override
	public void giveStar(Customer customer, Product product) {
		// TODO Auto-generated method stub
		if(product.isCofee()) {
			customer.setStars(customer.getStars()+1);
		}
	}

}
