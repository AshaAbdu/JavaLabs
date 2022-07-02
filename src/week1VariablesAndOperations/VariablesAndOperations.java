package week1VariablesAndOperations;

public class VariablesAndOperations {

	public static void main(String[] args) {
		
		//Create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 5;
		
		//Create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 23.64;
		
		//Create a variable to hold a person's middle Initial
		char middleInitial = 'H';
		
		//Create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isHotOutside = false;
		
		//create a variable to hold a customer's first name
		String firstName = "Asha ";
		
		//Create a variable to hold a street address
		String streetAddress = "120 Larkspur ln.";
		
		//Print all variables to the console
		System.out.println("Available seats on the plane: " + availablePlaneSeats); // Concatenation
		System.out.println(costOfGroceries + " is the price of the groceries.");
		System.out.println("The person's middle initial is " + middleInitial);
		System.out.println("It is hot outside - " + isHotOutside);
		System.out.println("The customer's first name " + firstName);
		System.out.println(streetAddress + " is where the customer lives.");
		
		//A customer booked two plane seats, remove 2 seats from the available seats variable
		availablePlaneSeats = availablePlaneSeats - 2; 
		availablePlaneSeats -= 2; //shorthand for variable itself minus 2
		System.out.println(availablePlaneSeats);
		
		// impulse candy bar purchase, add 2.15 to the grocery total
		costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries += 2.15; //shorthand version
		System.out.println(costOfGroceries);
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		middleInitial = 'D'; //assign a new value to the variable 
		System.out.println(middleInitial);
		
		//the season has changed, update the host outside variable to be opposite of what it was
		isHotOutside = true;
		isHotOutside = !isHotOutside; // ! negates any boolean value, also the last value assigned overrides the rest of values assigned to the same variable
		System.out.println(isHotOutside);
		
		//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
		String lastName = " Abdulkadir";
		String fullName = firstName + middleInitial + lastName ;
		System.out.println(fullName);
		
		// Alternatively String fullName = firstName + " " + middleInitial + " Abdulkadir" ;
		
		//print a line to the console that introduces the customer and says they live at the address variable 
		 System.out.println("Hello, I'm  " +fullName + " and I live at " + streetAddress);
		
		

	}

}
