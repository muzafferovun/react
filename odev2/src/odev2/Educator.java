package odev2;

public class Educator {
	int id;
	String name;
	String email;
	String photo;
	String resume;
	Educator(int id,String name,String email,String photo,String resume){
		this.id=id;
		this.name=name;
		this.email=email;
		this.photo=photo;
		this.resume=resume;
		
	}
	public void educatorInfo() {
		System.out.println(this.name);
		System.out.println("    EPosta Adresi :"+this.email);
		System.out.println("    Özgeçmiþ      :"+this.resume);
	}
}
