package day4homework2;

public class Main {

	public static void main(String[] args)  {
		CustomerCompany neroCustomer=new neroCustomerCompany(1,"Nero");
		CustomerCompany starbucksCustomer=new starbucksCustomerCompany(2,"StarBucks");
		CustomerManager customerManager=new CustomerManager();
		Customer[] customers=new Customer[100];
		customerManager.createCustomers(customers);
		customerManager.addCustomer(customers,new CustomerCompany[]{neroCustomer,starbucksCustomer},"Muzaffer","ÖVÜN","1982/12/10","1457849845");
		customerManager.addCustomer(customers,new CustomerCompany[]{neroCustomer},"Engin","DEMÝROÐ",("1988/01/10"),"4785145426");
		customerManager.addCustomer(customers,new CustomerCompany[]{starbucksCustomer},"Mustafa","KUÞ",("1979/05/15"),"35412554124");
		customerManager.listCustomers(customers);
		Product[] products=new Product[100];
		ProductManager productManager=new ProductManager();
		productManager.createProducts(products);
		productManager.addProduct(products,"Coffee",23,true);
		productManager.addProduct(products,"Cappucino",14,true);
		productManager.addProduct(products,"Expresso",8,true);
		productManager.addProduct(products,"Tea",6,false);
		productManager.addProduct(products,"Turkish Coffee",15,false);
		productManager.listProducts(products);

		CustomerProductPurcase[] customerProductPurcase=new CustomerProductPurcase[1000];
		CustomerProductPurcaseManager productPurchaseManager=new CustomerProductPurcaseManager();
		productPurchaseManager.createProducts(customerProductPurcase);
		productPurchaseManager.addCustomerPurchase(customerProductPurcase, products[0],customers[0], starbucksCustomer);
		productPurchaseManager.addCustomerPurchase(customerProductPurcase, products[1],customers[1], neroCustomer);
		productPurchaseManager.addCustomerPurchase(customerProductPurcase, products[3],customers[1], starbucksCustomer);
		productPurchaseManager.addCustomerPurchase(customerProductPurcase, products[2],customers[0], starbucksCustomer);
		productPurchaseManager.addCustomerPurchase(customerProductPurcase, products[2],customers[1], neroCustomer);
		productPurchaseManager.listProductPurchase(customerProductPurcase);
		customerManager.listStars(customers);
		productPurchaseManager.listCustomerProductPurchase(customerProductPurcase, customers[0]);
	}

}
