package odev2;

public class CourseManager {
	public void showCourseInfo(Course course) {
		System.out.println("Kurs Ad�   :"+course.courseName);
		System.out.println("E�itmen   :"+course.educator.name);
		System.out.println("Kurs Tarihi   :"+course.courseTarih);
		if(course.registerState==true)
			System.out.println("Kay�tlar Devam Ediyor");
		else
			System.out.println("Kay�tlar Kapand�");
			
	}
	public void showCourseAllInfo(Course[] courses) {
		for(Course course:courses) {
			System.out.println("Kurs Ad�   :"+course.courseName);
			System.out.println("E�itmen   :"+course.educator.name);
			System.out.println("Kurs Tarihi   :"+course.courseTarih);
			if(course.registerState==true)
				System.out.println("Kay�tlar Devam Ediyor");
			else
				System.out.println("Kay�tlar Kapand�");
		}
	}
}
