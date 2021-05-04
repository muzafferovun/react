package day4homework3fifoobject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company=new Company();
		company=CompanyManager.addCompany(company,"Nero");
		company=CompanyManager.addCompany(company,"Starbucks");
		company=CompanyManager.addCompany(company,"Kahve Dünyasý");
		company=CompanyManager.addCompany(company,"Mado");
		company=CompanyManager.deleteById(company,3);
		company=CompanyManager.update(company, 1, "Caffe Nero");
		System.out.println("------Sisteme Kayýtlý Firmalar------");
		CompanyManager.showCompanys(company);
		Product product=new Product();
		product=ProductManager.addProduct(product, "Tea");
		product=ProductManager.addProduct(product, "GrennTea");
		product=ProductManager.addProduct(product, "Turkish Coffee");
		product=ProductManager.addProduct(product, "Cappucina");
		product=ProductManager.addProduct(product, "Expresso");
		product=ProductManager.addProduct(product, "Mochiato");
		System.out.println("---------Sisteme Kayýtlý Ürünler------------");
		ProductManager.showProducts(product);
		CompanyProducts companyProduct=new CompanyProducts();
		//nero Products
		companyProduct=CompanyProductsManager.addCompanyProducts(companyProduct, CompanyManager.findById(company, 1) ,ProductManager.findById(product, 1), 14, false);
		companyProduct=CompanyProductsManager.addCompanyProducts(companyProduct, CompanyManager.findById(company, 1) ,ProductManager.findById(product, 2), 8, false);
		companyProduct=CompanyProductsManager.addCompanyProducts(companyProduct, CompanyManager.findById(company, 1) ,ProductManager.findById(product, 3), 13, true);
		companyProduct=CompanyProductsManager.addCompanyProducts(companyProduct, CompanyManager.findById(company, 1) ,ProductManager.findById(product, 4), 5, true);
		//Starbucks Products
		companyProduct=CompanyProductsManager.addCompanyProducts(companyProduct, CompanyManager.findById(company, 2) ,ProductManager.findById(product, 4), 16, true);
		companyProduct=CompanyProductsManager.addCompanyProducts(companyProduct, CompanyManager.findById(company, 2) ,ProductManager.findById(product, 5), 12, true);
		companyProduct=CompanyProductsManager.addCompanyProducts(companyProduct, CompanyManager.findById(company, 2) ,ProductManager.findById(product, 6), 21, true);
		System.out.println("---------Firmalarýn Sattýðý Ürünler------------");
		CompanyProductsManager.showCompanyProducts(companyProduct);
		
		Customer customer=new Customer();
		customer=CustomerManager.add(customer, "muzafferovun@hotmail.com", "1234","Muzaffer","Övün","18458745654",1982,new Company[] {CompanyManager.findById(company, 2),CompanyManager.findById(company, 1)});
		customer=CustomerManager.add(customer, "mustafakus@hotmail.com", "erwq1w234","Mustafa","Kuþ","14785412658",1979,new Company[] {CompanyManager.findById(company, 1),CompanyManager.findById(company, 2)});
		customer=CustomerManager.add(customer, "engindemirog@kodlama.io", "hjuý887dwd","Engin","Demiroð","25478465421",1986,new Company[] {CompanyManager.findById(company, 2)});
		System.out.println("---------Kullanýcýlar------------");
		CustomerManager.showCustomers(customer);
		
		ProductSales sales=new ProductSales();
		sales=ProductSalesManager.addProductSales(sales,CustomerManager.findById(customer,1), CompanyManager.findById(company,1), ProductManager.findById(product,4),companyProduct);
		sales=ProductSalesManager.addProductSales(sales,CustomerManager.findById(customer,2), CompanyManager.findById(company,2), ProductManager.findById(product,5),companyProduct);
		sales=ProductSalesManager.addProductSales(sales,CustomerManager.findById(customer,3), CompanyManager.findById(company,1), ProductManager.findById(product,6),companyProduct);
		sales=ProductSalesManager.addProductSales(sales,CustomerManager.findById(customer,1), CompanyManager.findById(company,2), ProductManager.findById(product,2),companyProduct);
		sales=ProductSalesManager.addProductSales(sales,CustomerManager.findById(customer,2), CompanyManager.findById(company,1), ProductManager.findById(product,1),companyProduct);
		System.out.println("---------Ürün Satýþlarý------------");
		ProductSalesManager.showProductSaless(sales);
		System.out.println("---------muzaffer satýlan ürünler------------");
		ProductSalesManager.showCustomerSaless(sales,CustomerManager.findById(customer,1));
		System.out.println("---------Kullanýcýlar Yýldýzlarý görmek için------------");
		CustomerManager.showCustomers(customer);
		
	}

}
