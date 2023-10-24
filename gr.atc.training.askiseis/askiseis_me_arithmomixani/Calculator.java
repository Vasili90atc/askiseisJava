
public class Calculator {

		Scanner sc = new Scanner(System.in);
		
		public Calculator() {}

		/**
		 * Adds to numbers
		 * @param x First number to add
		 * @param y Second number to add
		 * @return The result of the addition
		 */
		public double add(double x, double y) {
			return x+y;
		}
		public double sub(double x, double y) {
			return x-y;
		}
		public double mult(double x, double y) {
			return x*y;
		}
		public double div(double x, double y) {
			return x/y;
		}

		public double getNumberFromUser() {
			System.out.println("Input a number:");
			double userInput = 0.0;
			
			/*
			 * Try getting a number from user.
			 * If the input is not valid, try again.
			 */
			while(true) {
				try {
					String line = sc.nextLine();
					// Try parsing the input as a double - will throw exception if not possible
					userInput = Double.parseDouble(line);
					// If we've reached this line, then the input was a valid double
					break;
				}
				catch(NumberFormatException e) {
					System.out.println("Input not valid, try again:");
				}
			}
			return userInput;
		}
		
		
		/**
		 * Requests action from user, repeats until valid action is given
		 * @return Returns the string
		 */
		public String getActionFromUser() {
			System.out.println("Input the action you want performed:");
			System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
			System.out.println("Enter the corresponding number:");
			
			int userInput = 0;
			while(true) {
				try {
					String line = sc.nextLine();
					userInput = Integer.parseInt(line);
					if (userInput>0 && userInput<=4) {
						break;
					}
					else {
						System.out.println("Number not in range, try again:");
					}
				}
				catch(NumberFormatException e) {
					System.out.println("Input not valid, try again:");
				}
			}
			String userAction = null;
			switch(userInput) {
				case 1:
					userAction = "add";
					break;
				case 2:
					userAction = "sub";
					break;
				case 3:
					userAction = "mult";
					break;
				case 4:
					userAction = "div";
					break;
			}
			return userAction;
		}
		
		public double performCalculation() {
			double x = getNumberFromUser();
			double y = getNumberFromUser();
			
			String action = getActionFromUser();
			sc.close();
			
			switch(action) {
				case "add":
					return add(x,y);
				case "sub":
					return sub(x,y);
				case "mult":
					return mult(x,y);
				case "div":
					return div(x,y);
			}
			return Double.NaN;
		}
	}

}