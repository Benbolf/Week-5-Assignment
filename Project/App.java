package week5;

public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger1();
        asteriskLogger.log("Hello"); 
        asteriskLogger.error("Error"); 

        Logger spacedLogger = new SpacedLogger1();
        spacedLogger.log("Hello"); 
        spacedLogger.error("Error"); 

	}

}