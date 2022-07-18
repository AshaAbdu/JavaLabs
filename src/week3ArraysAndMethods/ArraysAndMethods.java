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

		
		
	}

}
