package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product newproduct=new Product();
		newproduct.id=1;
		newproduct.name="Lenovo";
		newproduct.unitPrice=12850;
		newproduct.detail="i7 8gb ram";
		Product newproduct1=new Product();
		newproduct1.id=2;
		newproduct1.name="Acer";
		newproduct1.unitPrice=133450;
		newproduct1.detail="i7 8gb ram";
		Product[] products= {newproduct,newproduct1,new Product(3, "iPhone", 12458, "iphone 8GB")};
		for(Product product:products) {
			System.out.println(product.id+"->"+product.name+"->"+product.unitPrice+"->"+product.detail);
			
		}
		System.out.println(products.length);
		Category c1=new Category();
		c1.id=1;
		c1.name="Bilgisayar";
		Category c2=new Category();
		c2.id=2;
		c2.name="Ev&Bahçe";
		Category[] categorys= {c1,c2};
		ProductManager pm=new ProductManager();
		pm.showProducts(products);
	}

}
