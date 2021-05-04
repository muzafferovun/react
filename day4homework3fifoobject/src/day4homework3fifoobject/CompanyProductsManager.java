package day4homework3fifoobject;

public class CompanyProductsManager {
	public static CompanyProducts addCompanyProducts(CompanyProducts companyProduct, Company company,Product product,double price, boolean giceStar) {
		if(companyProduct==null||companyProduct.getId()==-1) {
			
			companyProduct=new CompanyProducts(1, company,product, price, giceStar);
		}
		else {
			
			companyProduct.setCompanyProduct(CompanyProductsManager.addCompanyProducts(companyProduct.getCompanyProduct(), company, product, price, giceStar,companyProduct.getId()+1));
		}
	
		return companyProduct;
	
	}
	public static CompanyProducts addCompanyProducts(CompanyProducts companyProduct, Company company,Product product,double price, boolean giceStar,int id) {
		if(companyProduct==null||companyProduct.getId()==-1) {
			companyProduct=new CompanyProducts(id, company,product, price, giceStar);
		}
		else {
			
			companyProduct.setCompanyProduct(CompanyProductsManager.addCompanyProducts(companyProduct.getCompanyProduct(), company, product, price, giceStar,companyProduct.getId()+1));
		}
	
		return companyProduct;
	
	}
	public static void showCompanyProducts(CompanyProducts companyProduct) {
		if(companyProduct==null) {
		}
		else if(companyProduct.getId()==-1) {
			
		}
		else {
			System.out.println(companyProduct.getId()+"->"+companyProduct.getProduct().getName()+"->"+companyProduct.getCompany().getName());	
			CompanyProductsManager.showCompanyProducts(companyProduct.getCompanyProduct());
		}
	}
	public static CompanyProducts deleteById(CompanyProducts companyProduct, int id) {
		if(companyProduct!=null) {
			if(companyProduct.getId()==id) {
					return companyProduct.getCompanyProduct();
			}
			else {
				if(companyProduct.getCompanyProduct()!=null) {
					if(companyProduct.getCompanyProduct().getId()>-1)	companyProduct.setCompanyProduct(CompanyProductsManager.deleteById(companyProduct.getCompanyProduct(),id));
				}
			}
		}
		return companyProduct;
	}
	public static CompanyProducts update(CompanyProducts companyProduct, int id,double price,boolean giveStar) {
		if(companyProduct!=null) {
		
			if(companyProduct.getId()==id) {
				companyProduct.setPrice(price);
				companyProduct.setGiveStar(giveStar);
					return companyProduct;
			}
			else {
				if(companyProduct.getCompanyProduct()!=null) {
					companyProduct.setCompanyProduct(CompanyProductsManager.update(companyProduct.getCompanyProduct(),id, price, giveStar));
				}
			}
		}
		return companyProduct;
	}
	public static CompanyProducts findById(CompanyProducts companyProduct, Company company,Product product) {
		if(companyProduct!=null) {
		
			if(companyProduct.getCompany().getId()==company.getId()&&companyProduct.getProduct().getId()==product.getId()) {
					return companyProduct;
			}
			else {
				if(companyProduct.getCompanyProduct()!=null) {
					companyProduct=CompanyProductsManager.findById(companyProduct.getCompanyProduct(),company,product);
				}
			}
		}
		return companyProduct;
	}

}
