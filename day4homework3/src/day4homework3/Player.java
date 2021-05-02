package day4homework3;

public class Player {
	private int id;
	private String userName;
	private String nickName;
	private String password;
	private String name;
	private String surName;
	private String nationalIdentity;
	private int birthYear;
	private double creditValue;
	Player(int id, String userName, String nickName, String password, String name, String surName,
			String nationalIdentity, int birthYear) {
		this.id = id;
		this.userName = userName;
		this.nickName = nickName;
		this.password = password;
		this.name = name;
		this.surName = surName;
		this.nationalIdentity = nationalIdentity;
		this.birthYear = birthYear;
		this.creditValue=0;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
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
	public double getCreditValue() {
		return creditValue;
	}
	public void setCreditValue(double creditValue) {
		this.creditValue = creditValue;
	}
	
	
}
