package week3ArraysAndMethods;

public class ArraysAndMethods {

	public static void main(String[] args) {
		// create an array with the following values 1, 5, 2, 8, 13, 6
		int[] array = new int[6];
		array[0] = 1;
		array[1] = 5;
		array[2] = 2;
		array[3] = 8;
		array[4] = 13;
		array[5] = 6;
		
		//a simpler way is: int[] array ={1, 5, 2, 8, 13, 6};
		
		//printout the first element in the array
		System.out.println(array[0]);
		
		//print out the last element in the array without using the number 5
		System.out.println(array[array.length -1]);
		
		//print out the element in the array at position 6.  what happens?..error: does not exist in array n out of bound
		//System.out.println(array[6]);
		
		//print out the element in the array at position -1. what happens? ...error out of bound 
		//System.out.println(array[-1]);
		
		//write a traditional for loop that prints out each element in the array ...< array.length is same as minus one
		for (int i =0; i< array.length; i++) {
			System.out.println(array[i]);
		}
		
		//write an enhance for loop that prints out each element in the array
		for (int number : array) {
			System.out.println(number);
		}
		
		//create a new variable called sum, write a loop that adds each element in the array to the sum
		double sum = 0;
		for (int number : array) {
			sum += number;
		}
		System.out.println(sum);
		
		
		//create a new variable called average and assign the average value of the array to it
		double average = sum / array.length;
		System.out.println(average);
		
		//write an enhanced for loop that prints out each number in the array only if the number is odd 
		// == 0  gives even and != or == 1 gives odd 
		for (int number : array) {
			if (number % 2 != 0) {
				System.out.println(number);
			}
		}
		
		//create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String [] names = { "Sam", "Sally", "Thomas", "Robert" };
		
		
		//calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);

		//write and test a method that takes a String name and prints out a greeting, this method returns nothing
		greet ("Tom");
		greet ("Asha");
		//write and test a method that takes a String name and return a greeting, do not print in the method
		//alternatively: System.out.println(greet2 ("Nick"));
		String greeting = greet2 ("Nick");
		System.out.println(greeting);
		
		//analyze the difference between two methods - what do you find? How are they different?
		
		/*
		 * one prints out something and the second returns something
		 */
		
		//write and test a method that takes a String and an int and returns true if the number of letters in the string is greater than the int
		System.out.println(isStringGreaterThanNumber("Hello", 3)); //change to 6 prints false 
		
		//write and test a method that takes an array of string and a string and returns true if the String passed in exists in the array
		System.out.println(doesArrayContainString(names, "Hello"));
		
		//write and test a method that takes an array of int and returns the smallest number in the array
		
		// write and test a method that takes an array of double and returns the average
		
	}
	//methods
  public static void greet(String name) {
	System.out.println("Hello, " + name + "!");
}
  public static String greet2(String name) {
	  return "Hi, " + name + "!";
  }
  public static boolean isStringGreaterThanNumber (String string, int Number) {
	  // get rid of if else statement all together and use return to get same result : return string.length() > number;
	 if (string.length() > Number) {
		 return true;
	 } else {
		 return false; // get rid of else statement and get same result
	 }
  }
	 
  public static boolean doesArrayContainString(String[] array, String string) {
	  for (String str : array) {
		  if (str.equals(string)) {
			  return true;
		  }
	  }
	  return false;
  }
	  
}
