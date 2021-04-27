package odev2;

public class CourseManager {
	public void showCourseInfo(Course course) {
		System.out.println("Kurs Adý   :"+course.courseName);
		System.out.println("Eðitmen   :"+course.educator.name);
		System.out.println("Kurs Tarihi   :"+course.courseTarih);
		if(course.registerState==true)
			System.out.println("Kayýtlar Devam Ediyor");
		else
			System.out.println("Kayýtlar Kapandý");
			
	}
	public void showCourseAllInfo(Course[] courses) {
		for(Course course:courses) {
			System.out.println("Kurs Adý   :"+course.courseName);
			System.out.println("Eðitmen   :"+course.educator.name);
			System.out.println("Kurs Tarihi   :"+course.courseTarih);
			if(course.registerState==true)
				System.out.println("Kayýtlar Devam Ediyor");
			else
				System.out.println("Kayýtlar Kapandý");
		}
	}
}
