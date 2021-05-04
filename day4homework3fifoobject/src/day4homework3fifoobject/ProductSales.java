package day4homework3fifoobject;

public class ProductSales {
	private int id;
	private Customer customer;
	private Company company;
	private Product product;
	private double price;
	private ProductSales productSales;
	public ProductSales() {
		this.id=-1;
		this.customer=null;
		this.company=null;
		this.product=null;
		this.price=0;
		this.productSales=null;
	}
	public ProductSales(int id, Customer customer, Company company, Product product, double price) {
		super();
		this.id = id;
		this.customer = customer;
		this.company = company;
		this.product = product;
		this.price = price;
		this.productSales = null;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ProductSales getProductSales() {
		return productSales;
	}
	public void setProductSales(ProductSales productSales) {
		this.productSales = productSales;
	}
}
