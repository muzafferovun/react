package hafta3Odev2;

public class CourseManager {
	public Course[] loadCourses(Course[] courses,int[] courseIds) {
			Course[] newCourse=new Course[courseIds.length];
			int j;
			for(int i=0;i<courseIds.length;i++) {
				for(j=0;j<courses.length;j++) {
					
					if(courses[j].id==courseIds[i]) {
						newCourse[i]=courses[j];
					}
				}
			}
			
		return newCourse;
	}
	public void showInstructorInfo(Course course) {
		System.out.println(course.instructor.getName()+" "+course.instructor.getSurname());
	}
}
