package odev2;

public class Main {

	public static void main(String[] args) {
		Educator[] educators= {
				new Educator(1,"Engin Demirog","engindemirog@kodlama.io","images/photo1.png","engin demiro� �zge�mi� bilgileri")
				,new Educator(2,"Muzaffer �v�n","muzafferovun@hotmail.com","images/photo2.png","muzaffer �v�n �zge�mi� bilgileri")
				,new Educator(3,"Mustafa Ku�","mustafa_kus@hotmail.com","images/photo3.png","mustafa ku� �zge�mi� bilgileri")
				};
		Course[] courses= {
				new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�","2 Ocak 2021",false,"S�f�rdan ba�lay�p yepyeni bir metodolojiyle profesyonelle�eceksiniz\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "Adaylar�n bir �o�u ��renme d�ng�s� dedi�im bir ��kmaz�n i�inde.\r\n"
						+ "\r\n"
						+ "S�rekli ayn� konular� ��renip daldan dala atl�yor.\r\n"
						+ "\r\n"
						+ "Bu sorunun temelini programlamay� ger�ek hayatla ili�kilendirememek olarak g�r�yorum.\r\n"
						+ "\r\n"
						+ "Programlama teknolojilerinin hepsi ayn� temele dayan�r. Kampta bunu ��reneceksiniz.",educators[0])
				,new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA & REACT)","23 Nisan 2021",true,"21 Nisan'da ba�l�yoruz\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "�ar�amba ve Cumartesi g�nleri 21.00'da ba�lay�p 3 saat ders yapaca��z.\r\n"
						+ "Her g�ne ait ders videolar�n� kursumuzun ar�ivine ekleyece�iz.\r\n"
						+ "Her ders sonunda sizi tamamlay�c� �devler bekliyor.",educators[1])
				
		};
		for(Educator educator:educators) {
			educator.educatorInfo();
		}
		CourseManager courseManager=new CourseManager();
		courseManager.showCourseInfo(courses[1]);
	}

}
