package hafta3Odev2;

public class Student extends User {
	private Course[] courses;
	Student(
		int id,String username,String pass,String name,String surname,String picture,String email,String phoneNumber
		,Course[] courses
){
		this.setId(id);
		this.setUsername(username);
		this.setPass(pass);
		this.setName(name);
		this.setSurname(surname);
		this.setPicture(picture);
		this.setEmail(email);
		this.setPhoneNumber(phoneNumber);
		this.courses=courses;
	}
	public void showProfile() {
		super.showProfile();
		System.out.println("      Kayýtlý Olduðu Kurslar");
		CourseManager courseManager=new CourseManager();
		for(Course course:this.courses) {
			System.out.println("          "+course.id+"->"+course.courseName);
			
			System.out.print("            Eðitmen :");
			courseManager.showInstructorInfo(course);
			
		}
	}
}
