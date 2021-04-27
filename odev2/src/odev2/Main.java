package odev2;

public class Main {

	public static void main(String[] args) {
		Educator[] educators= {
				new Educator(1,"Engin Demirog","engindemirog@kodlama.io","images/photo1.png","engin demiroð özgeçmiþ bilgileri")
				,new Educator(2,"Muzaffer Övün","muzafferovun@hotmail.com","images/photo2.png","muzaffer övün özgeçmiþ bilgileri")
				,new Educator(3,"Mustafa Kuþ","mustafa_kus@hotmail.com","images/photo3.png","mustafa kuþ özgeçmiþ bilgileri")
				};
		Course[] courses= {
				new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý","2 Ocak 2021",false,"Sýfýrdan baþlayýp yepyeni bir metodolojiyle profesyonelleþeceksiniz\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "Adaylarýn bir çoðu öðrenme döngüsü dediðim bir çýkmazýn içinde.\r\n"
						+ "\r\n"
						+ "Sürekli ayný konularý öðrenip daldan dala atlýyor.\r\n"
						+ "\r\n"
						+ "Bu sorunun temelini programlamayý gerçek hayatla iliþkilendirememek olarak görüyorum.\r\n"
						+ "\r\n"
						+ "Programlama teknolojilerinin hepsi ayný temele dayanýr. Kampta bunu öðreneceksiniz.",educators[0])
				,new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA & REACT)","23 Nisan 2021",true,"21 Nisan'da baþlýyoruz\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "Çarþamba ve Cumartesi günleri 21.00'da baþlayýp 3 saat ders yapacaðýz.\r\n"
						+ "Her güne ait ders videolarýný kursumuzun arþivine ekleyeceðiz.\r\n"
						+ "Her ders sonunda sizi tamamlayýcý ödevler bekliyor.",educators[1])
				
		};
		for(Educator educator:educators) {
			educator.educatorInfo();
		}
		CourseManager courseManager=new CourseManager();
		courseManager.showCourseInfo(courses[1]);
	}

}
