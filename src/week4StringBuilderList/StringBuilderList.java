package week4StringBuilderList;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderList {

	public static void main(String[] args) {
		
		//Why would we use a StringBuilder instead of a String? sting is immutable while StringBuilder is mutable and add remove characters without creating multiple objects
		
		//instantiate a new StringBuilder and append the characters 0 through 9 to it separated by dashes
		//make sure no dash appears at the end of the StringBuilder
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 10; i++) {
			if (i!=9) {                 //removes dash at the end
				sb.append(i + "-"); 
			} else {
				sb.append(i);
			}
			// shorten the code - within for loop code - sb.append(i); if (i!=9){sb.append("-"); and get same result
		}
		
		System.out.println(sb.toString());
		
		//create a list of Strings and add5 Strings to it, each with a different length
		List<String> strings = new ArrayList<String>();
		
		strings.add("Tom");
		strings.add("Sammy");
		strings.add("Paul");
		strings.add("I");
		strings.add("Me");
		
		//write and test a method that takes a list of strings and returns the shortest string
		System.out.println(findShortestString(strings));
		
		//write and test a method that takes a list of strings and returns the list with the first and last element switched
		List<String> swapped = swapFirstAndLast(strings);
		for (String string : swapped) {
			System.out.println(string);
		}
		
		//write and test a method that takes a list of strings and returns a string with all the list elements concatenated to each other,
		//seperated by a comma
		System.out.println(combineStrings(swapped));

		
		
		//write and test a method that takes a list of strings and a string and returns a new list with all strings from the original list
		// containg the second string parameter(i.e like a search method)
		
		//write and test a method that takes a list of intergers and returns a List(List<Integer>> where the first list in the returned value
		//contains any number from the input list that is divisible by 2, the second list contains values from the input list that are divisible
		//by 3, the third divisible by 5, and the forth all numbers from the input list not divisible by 2, 3, or 5
		
		//write and test a method that takes a list of strings and returns a list of integers that contains the length of each string
		

	}
	
	public static String findShortestString(List<String> list) {
		String shortest = list.get(0);
		for (String string : list) {
			if (string.length() < shortest.length()) {
				shortest =string;
			}
		}
		return shortest;
	}
	
	public static List<String> swapFirstAndLast (List<String> list) {
		String temp = list.get(0);
		list.set(0, list.get(list.size()-1));
		list.set(list.size()-1, temp);
		return list;
	}
	
	public static String combineStrings(List<String> strings) {
		StringBuilder result = new StringBuilder();
		for (String string : strings) {
			result.append(string + ", ");
		}
		return result.toString();
	}


}
