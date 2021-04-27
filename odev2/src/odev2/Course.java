package odev2;

public class Course {
	int id;
	String courseName;
	String courseTarih;
	boolean registerState;
	String courseInfo;
	Educator educator;
	Course(int id,String courseName,String courseTarih,boolean registerState,String courseInfo,Educator educator){
		this.id=id;
		this.courseName=courseName;
		this.courseTarih=courseTarih;
		this.registerState=registerState;
		this.courseInfo=courseInfo;
		this.educator=educator;
	}
}
