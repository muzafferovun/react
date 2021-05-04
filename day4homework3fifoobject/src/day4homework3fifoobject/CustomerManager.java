package day4homework3fifoobject;

public  class CustomerManager {
	public static Customer add(Customer customer,String mail,String password, String name, String surname, String nationalIdentity,	int birthYear,Company[] company) {
		if(customer==null||customer.getId()==-1) {
			customer=new Customer(1, mail, password, name, surname, nationalIdentity, birthYear,company);
		}
		else {
			
			customer.setCustomer(CustomerManager.add(customer.getCustomer(),mail,password, name, surname, nationalIdentity, birthYear,company,customer.getId()+1));
		}
	
		return customer;
	}
	public static Customer add(Customer customer,String mail,String password, String name, String surname, String nationalIdentity,	int birthYear,Company[] company,int id) {
		if(customer==null||customer.getId()==-1) {
			customer=new Customer(id, mail, password, name, surname, nationalIdentity, birthYear,company);
		}
		else {
			
			customer.setCustomer(CustomerManager.add(customer.getCustomer(),mail,password, name, surname, nationalIdentity, birthYear,company,customer.getId()+1));
		}
	
		return customer;
	}
	public static void showCustomers(Customer customer) {
		if(customer==null) {
		}
		else if(customer.getId()==-1) {
			
		}
		else {
			System.out.println(customer.getId()+"->"+customer.getMail()+"("+customer.getStars()+" Star)");	
			CustomerManager.showCustomers(customer.getCustomer());
		}
	}

	public static Customer findById(Customer customer, int id) {
		if(customer!=null) {
		
			if(customer.getId()==id) {
					return customer;
			}
			else {
				if(customer.getCustomer()!=null) {
					customer=CustomerManager.findById(customer.getCustomer(),id);
				}
			}
		}
		return customer;
	}

}
