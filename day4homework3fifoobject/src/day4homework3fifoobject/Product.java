package day4homework3fifoobject;

public class Product {
	private int id;
	private String name;
	private Product product;
	public Product() {
		this.id=-1;
		this.name="";
		this.product=null;
		
	}
	public Product(int id, String name,Product product) {
		super();
		this.id = id;
		this.name = name;
		this.product=product;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
