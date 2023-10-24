
public class App {
	 public static void main( String[] args ) {
	    	Calculator c = new Calculator();
	    	/*
	    	// Test getNumberFromUser()
	    	double num = c.getNumberFromUser();
	    	System.out.println("Num is: " + num);
	    	*/
	    	/*
	    	// Test getActionFromUser()
	    	String action = c.getActionFromUser();
	    	System.out.println("Action is: " + action);
	    	*/
	    	double result = c.performCalculation();
	    	System.out.println("Result is: " + result);
	    }
	}

}
