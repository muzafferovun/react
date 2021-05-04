package day4homework3fifoobject;

public class LoggerManager {
	public Logger[] log(String className) {
		Logger[] loggers={};
		if(className=="Game") {	loggers=new Logger[] {new EmailLogger(),new FileLogger(),new DatabaseLogger()};	}
		if(className=="Player") {	loggers=new Logger[] {new EmailLogger(),new FileLogger(),new DatabaseLogger()};	}
		if(className=="Campaign") {	loggers=new Logger[] {new EmailLogger(),new FileLogger(),new DatabaseLogger()};	}
		if(className=="GameSales") {	loggers=new Logger[] {new EmailLogger(),new FileLogger(),new DatabaseLogger()};	}
		
		return loggers;
	}
	public Logger[] log(String className,String action) {
		Logger[] loggers={};
		if(className=="Game"&&action=="add") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		if(className=="Game"&&action=="delete") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		if(className=="Game"&&action=="update") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		if(className=="Game"&&action=="list") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		
		if(className=="Player"&&action=="add") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		if(className=="Player"&&action=="delete") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		if(className=="Player"&&action=="update") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		if(className=="Player"&&action=="list") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		if(className=="Player"&&action=="creditLoad") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
			
		if(className=="Campaign"&&action=="add") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		if(className=="Campaign"&&action=="delete") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		if(className=="Campaign"&&action=="update") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		if(className=="Campaign"&&action=="list") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		
		if(className=="GameSales"&&action=="add") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		if(className=="GameSales"&&action=="delete") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		if(className=="GameSales"&&action=="update") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		if(className=="GameSales"&&action=="list") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		
		return loggers;
	}
}
