package day4homework3;

public class Utils {
	public static void RunLoggers(Logger[] loggers,String message) {
		for(Logger logger:loggers)	logger.log(message);

	}
}