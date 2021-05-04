package day4homework3fifoobject;

public class ProductSalesManager {
	public static ProductSales addProductSales(ProductSales productSales, Customer customer, Company company, Product product, CompanyProducts companyProduct) {
		double price=0;
		CompanyProducts companyProducts=CompanyProductsManager.findById(companyProduct, company, product);
		
		if(productSales==null||productSales.getId()==-1) {
			productSales=new ProductSales(1, customer, company, product, companyProducts.getPrice());
			if(companyProducts.isGiveStar()) customer.setStars(customer.getStars()+1);
		}
		else {
			
			productSales.setProductSales(ProductSalesManager.addProductSales(productSales.getProductSales(),customer, company, product,companyProduct,productSales.getId()+1));
		}
	
		return productSales;
	
	}
	public static ProductSales addProductSales(ProductSales productSales, Customer customer, Company company, Product product, CompanyProducts companyProduct,int id) {
		double price=0;
		CompanyProducts companyProducts=CompanyProductsManager.findById(companyProduct, company, product);
		
		if(productSales==null||productSales.getId()==-1) {
			productSales=new ProductSales(id, customer, company, product, companyProducts.getPrice());
			if(companyProducts.isGiveStar()) customer.setStars(customer.getStars()+1);
		}
		else {
			
			productSales.setProductSales(ProductSalesManager.addProductSales(productSales.getProductSales(),customer, company, product,companyProduct,productSales.getId()+1));
		}
	
		return productSales;
	
	}
	public static void showProductSaless(ProductSales productSales) {
		if(productSales==null) {
		}
		else if(productSales.getId()==-1) {
			
		}
		else {
			System.out.println(
						productSales.getId()
						+"->"+productSales.getProduct().getName()
						+": ("+productSales.getPrice()+"TL)"
						+"->"+productSales.getCustomer().getName()+" "+productSales.getCustomer().getSurname()
						+"->"+productSales.getCompany().getName()
				);	
			ProductSalesManager.showProductSaless(productSales.getProductSales());
		}
	}
	public static void showCustomerSaless(ProductSales productSales,Customer customer) {
		if(productSales==null) {
		}
		else if(productSales.getId()==-1) {
			
		}
		else {
			if(productSales.getCustomer().getId()==customer.getId()) {
			System.out.println(
						productSales.getId()
						+"->"+productSales.getProduct().getName()
						+": ("+productSales.getPrice()+"TL)"
						+"->"+productSales.getCustomer().getName()+" "+productSales.getCustomer().getSurname()
						+"->"+productSales.getCompany().getName()
				);	
			}
			ProductSalesManager.showCustomerSaless(productSales.getProductSales(),customer);
		}
	}
	public static ProductSales deleteById(ProductSales productSales, int id) {
		if(productSales!=null) {
			if(productSales.getId()==id) {
					return productSales.getProductSales();
			}
			else {
				if(productSales.getProductSales()!=null) {
					if(productSales.getProductSales().getId()>-1)	productSales.setProductSales(ProductSalesManager.deleteById(productSales.getProductSales(),id));
				}
			}
		}
		return productSales;
	}
	public static ProductSales update(ProductSales productSales, int id,double price) {
		if(productSales!=null) {
		
			if(productSales.getId()==id) {
				productSales.setPrice(price);
					return productSales;
			}
			else {
				if(productSales.getProductSales()!=null) {
					productSales.setProductSales(ProductSalesManager.update(productSales.getProductSales(),id,price));
				}
			}
		}
		return productSales;
	}
	public static ProductSales findById(ProductSales productSales, int id) {
		if(productSales!=null) {
		
			if(productSales.getId()==id) {
					return productSales;
			}
			else {
				if(productSales.getProductSales()!=null) {
					productSales=ProductSalesManager.findById(productSales.getProductSales(),id);
				}
			}
		}
		return productSales;
	}

}
