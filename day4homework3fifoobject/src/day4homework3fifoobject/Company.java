package day4homework3fifoobject;

public class Company {
	private int id;
	private String name;
	private Company company;
	public Company() {
		this.id = -1;
		this.name = "";
		this.company=null;
	}
	public Company(int id, String name, Company company) {
		this.id = id;
		this.name = name;
		this.company = company;
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
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
}
