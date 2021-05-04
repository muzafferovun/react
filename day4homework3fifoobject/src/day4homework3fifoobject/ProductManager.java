package day4homework3fifoobject;

public class ProductManager {
	public static Product addProduct(Product product,String name) {
		if(product==null||product.getId()==-1) {
			product=new Product(1, name, product);
		}
		else {
			
			product.setProduct(ProductManager.addProduct(product.getProduct(),name,product.getId()+1));
		}
	
		return product;
	
	}
	public static Product addProduct(Product product,String name,int id) {
		if(product==null||product.getId()==-1) {
			product=new Product(id, name, product);
		}
		else {
			
			product.setProduct(ProductManager.addProduct(product.getProduct(),name,product.getId()+1));
		}
	
		return product;
	
	}
	public static void showProducts(Product product) {
		if(product==null) {
		}
		else if(product.getId()==-1) {
			
		}
		else {
			System.out.println(product.getId()+"->"+product.getName());	
			ProductManager.showProducts(product.getProduct());
		}
	}
	public static Product deleteById(Product product, int id) {
		if(product!=null) {
			if(product.getId()==id) {
					return product.getProduct();
			}
			else {
				if(product.getProduct()!=null) {
					if(product.getProduct().getId()>-1)	product.setProduct(ProductManager.deleteById(product.getProduct(),id));
				}
			}
		}
		return product;
	}
	public static Product update(Product product, int id,String name) {
		if(product!=null) {
		
			if(product.getId()==id) {
				product.setName(name);
					return product;
			}
			else {
				if(product.getProduct()!=null) {
					product.setProduct(ProductManager.update(product.getProduct(),id,name));
				}
			}
		}
		return product;
	}
	public static Product findById(Product product, int id) {
		if(product!=null) {
		
			if(product.getId()==id) {
					return product;
			}
			else {
				if(product.getProduct()!=null) {
					product=ProductManager.findById(product.getProduct(),id);
				}
			}
		}
		return product;
	}

}
