package day4homework3fifoobject;

public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Sms Log: "+message);
		
	}

}
