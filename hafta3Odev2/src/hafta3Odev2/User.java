package hafta3Odev2;

public class User {
	private int id;
	private String username;
	private String pass;
	private String name;
	private String surname;
	private String picture;
	private String email;
	private String phoneNumber;
	private int numberOfViews=0;
	private int viewsCount() {
		this.numberOfViews++;
		return this.numberOfViews;
	}
	public void showProfile() {
		System.out.println("Kullanýcý Bilgileri :");
		System.out.println("      Username :"+this.getUsername());
		System.out.println("      Name :"+this.getName());
		System.out.println("      Surname :"+this.getSurname());
		System.out.println("      Email Adres :"+this.getEmail());
		System.out.println("      Phone Number :"+this.getPhoneNumber());
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
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
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
