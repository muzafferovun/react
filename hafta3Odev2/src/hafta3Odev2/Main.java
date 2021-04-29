package hafta3Odev2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor[] instructors= {
				new Instructor(3,"Egitmen1", "6asdh7", "Engin", "Demiroð", "photo23", "engindemirog@kodlama.io", "", "Founder @ Kodlama.io, Co-Founder @ SolidTeam & DevArchitecture, Instructor and Lifetime Learner","Co-Founder at Kodlama.io", "Baþkent Üniversitesi","Management Information Systems", "Ortadoðu Teknik Üniversitesi")
				,new Instructor(4,"Egitmen2", "as324", "Muzaffer", "Övün", "photo14", "muzafferovun@hotmail.com", "", "Teacher,Web Designer","Project Developer at Verim Robotics", "Sakarya Üniversitesi","Computer Systems Teaching", "")
		
		};
		Course[] courses= {
					new Course(1,"c# + Angular",instructors[0])
					,new Course(2,"Java + React",instructors[0])
					,new Course(3,"Programlamaya Giriþ",instructors[1])
				};
		CourseManager courseManager=new CourseManager();
		Student[] students= {
				new Student(1,"sdudent1","dsfwr24","Ali","Atmaca","photo1.png","aliatmaca@gmail.com","05486454654"
						,courseManager.loadCourses(courses,new int[]{1,2})
						
						)
				,new Student(2,"sdudent2","76gsg87","Ahmet","Özdemir","photo2.png","ahmetozdemir@gmail.com","0545489454"
						,courseManager.loadCourses(courses,new int[]{3,1})
						
						)
				
		};
		students[0].showProfile();
		instructors[0].showProfile();
		
	}

}
