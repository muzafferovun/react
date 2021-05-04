package day4homework3fifoobject;

public class Customer {
	private int id;
	private String mail;
	private String Password;
	private String name;
	private String surname;
	private String nationalIdentity;
	private int birthYear;
	private Customer customer;
	private Company[] company;
	private int stars;
	public Customer() {
		super();
		this.id = -1;
		this.mail = "";
		Password = "";
		this.name = "";
		this.surname = "";
		this.nationalIdentity = "";
		this.birthYear = 0;
		this.customer = null;
		this.stars=0;
		this.company= new Company[]{};
	}
	public Customer(int id, String mail, String password, String name, String surname, String nationalIdentity,
			int birthYear,Company[] company) {
		super();
		this.id = id;
		this.mail = mail;
		Password = password;
		this.name = name;
		this.surname = surname;
		this.nationalIdentity = nationalIdentity;
		this.birthYear = birthYear;
		this.company= company;
		this.stars=0;
		this.customer = null;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public Company[] getCompany() {
		return company;
	}
	public void setCompany(Company[] company) {
		this.company = company;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	
}
