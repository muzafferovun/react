package day4homework3;

public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Sms Log: "+message);
		
	}

}
