package hafta3Odev2;

public class Instructor extends User {
	private String profile;
	private String experiance;
	private String university;
	private String academicDepartment;
	private String postgraduateEducation;
	
	Instructor(
			int id,String username,String pass,String name,String surname,String picture,String email,String phoneNumber
			,String profile,String experiance,String university,String academicDepartment,String postgraduateEducation
	){
			this.setId(id);
			this.setUsername(username);
			this.setPass(pass);
			this.setName(name);
			this.setSurname(surname);
			this.setPicture(picture);
			this.setEmail(email);
			this.setPhoneNumber(phoneNumber);
			this.profile=profile;
			this.experiance=experiance;
			this.university=university;
			this.academicDepartment=academicDepartment;
			this.postgraduateEducation=postgraduateEducation;
		}
	
	public void showProfile() {
		super.showProfile();
		System.out.println("Eðitmen Bilgileri");
		
		System.out.println("      Profile :"+this.getProfile());
		System.out.println("      Experiance :"+this.getExperiance());
		System.out.println("      Univercity :"+this.getUniversity());
		System.out.println("      Academic Department :"+this.getAcademicDepartment());
		System.out.println("      Postgraduate Education :"+this.getPostgraduateEducation());
		
		
	}
	
	
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getExperiance() {
		return experiance;
	}
	public void setExperiance(String experiance) {
		this.experiance = experiance;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getAcademicDepartment() {
		return academicDepartment;
	}
	public void setAcademicDepartment(String academicDepartment) {
		this.academicDepartment = academicDepartment;
	}
	public String getPostgraduateEducation() {
		return postgraduateEducation;
	}
	public void setPostgraduateEducation(String postgraduateEducation) {
		this.postgraduateEducation = postgraduateEducation;
	}
	
}
