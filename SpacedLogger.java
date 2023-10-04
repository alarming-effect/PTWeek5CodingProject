package week5codingproject;

public class SpacedLogger implements logger {

	
//	Implement the SpacedLogger methods:
//		Note:  The SpacedLogger should add a space or " " between each character of the String argument passed into its methods.
//		a. If the log method received “Hello” as an argument, it should print H e l l o
//		b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
	
	public void log(String log) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			   if (i > 0) {
			      result.append(" ");
			    }
			   result.append(log.charAt(i));
			}
			System.out.println(result.toString());
	}
	public void error(String error) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			   if (i > 0) {
			      result.append(" ");
			    }
			   result.append(error.charAt(i));
			}
			System.out.println("ERROR: " + result.toString());
	}
}
