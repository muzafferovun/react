package day4homework3fifoobject;

public class FileLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("File Log :"+message);
		
	}
}
