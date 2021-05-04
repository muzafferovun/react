package day4homework3fifoobject;

public class CompanyProducts {
	private int id;
	private Company company;
	private Product product;
	private double price;
	private boolean giveStar;
	private CompanyProducts companyProduct;
	public CompanyProducts() {
		super();
		this.id=-1;
		this.company = null;
		this.product =null;
		this.price = 0;
		this.giveStar = false;
		this.companyProduct=null;
	}
	public CompanyProducts(int id, Company company, Product product, double price, boolean giveStar) {
		super();
		this.id = id;
		this.company = company;
		this.product = product;
		this.price = price;
		this.giveStar = giveStar;
		this.companyProduct = null;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public boolean isGiveStar() {
		return giveStar;
	}
	public void setGiveStar(boolean giveStar) {
		this.giveStar = giveStar;
	}
	public CompanyProducts getCompanyProduct() {
		return companyProduct;
	}
	public void setCompanyProduct(CompanyProducts companyProduct) {
		this.companyProduct = companyProduct;
	}
	
}
