package week5codingproject;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		 Create a class named App that has a main method.
//		 a.  In this class instantiate an instance of each of your logger classes that implement the Logger interface.
//		 b. Test both methods on both instances, passing in Strings of your choice.
	
		AsteriskLogger logger = new AsteriskLogger();
		logger.log("Zenith");
		logger.error("Yoga");
		
		SpacedLogger logger1 = new SpacedLogger();
		logger1.log("x-Ray");
		logger1.error("Whistle");
		
	}//end of main method

}//end
