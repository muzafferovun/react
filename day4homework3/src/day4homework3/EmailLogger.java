package day4homework3;


public class EmailLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Email Log: "+message);
		
	}

}
