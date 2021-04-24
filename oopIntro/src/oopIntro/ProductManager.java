package oopIntro;

public class ProductManager {
	public void showProducts(Product[] addProduct) {
		for(Product product:addProduct) {
			System.out.println(product.name);
		}
	}
}
