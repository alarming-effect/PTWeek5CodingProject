package week5codingproject;

public class AsteriskLogger implements logger {

//	 Implement the AsteriskLogger methods:  
//		 Note:  The AsteriskLogger will use the asterisk or "*".
//		 a.  The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String 
//			(e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console).
//		 b. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, 
//			with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, the following should be printed:
//		 ****************
//		 ***Error: Hello***
//		 ****************

	public void log(String log) {
			System.out.println("***" + log + "***");
	}
	public void error(String error) {
				System.out.println("****************" +System.lineSeparator() +"***Error: " + error + "***" +System.lineSeparator() + "****************");
}
	
}

