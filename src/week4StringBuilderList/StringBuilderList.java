package week4StringBuilderList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		System.out.println("-----------------");
		List<String> searchResults = search(strings, "a");
		for (String result : searchResults) {
			System.out.println(result);
		}
		
		//write and test a method that takes a list of intergers and returns a List(List<Integer>> where the first list in the returned value
		//contains any number from the input list that is divisible by 2, the second list contains values from the input list that are divisible
		//by 3, the third divisible by 5, and the forth all numbers from the input list not divisible by 2, 3, or 5
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 25, 30);
		
		List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);
		
		for (List<Integer> list : sortedNumbers) {
			for (Integer number : list) {
				System.out.println(number);
			}
			System.out.println("Next list ----------");
		}
		
		
		//write and test a method that takes a list of strings and returns a list of integers that contains the length of each string
		
		List<Integer> stringsLengths = calculateStringLengths(strings);
		for (Integer i : stringsLengths) {
			System.out.println(i);
		}
		
		//create a set of Strings and add 5 values
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("World");
		set.add("Goodbye");
		set.add("Hi");
		set.add("Hello Again");
		
		
		//write and test a method that takes a set of strings and a character and returns a set of strings consisting of all the strings in the
		//input set that start with the character parameter
		
	    Set<String> startsWithH = findAllThatStartWith(set, 'H');
	    for (String word : startsWithH) {
	    	System.out.println(word);
	    }
	     
		//write and test a method that takes a set of strings and returns a list of the same strings
	    
	    List<String> resultList = convertSetToList(set);
	    
	    for (String listString : resultList) {
	    	System.out.println(listString);
	    }
		
		//write and test a method that takes a set of integers and returns a new set of integers containg only even numbers from the original set
		
		// create a map of string and string and add 3 items to it where the key of each is a word and the value is the defination of the word
		
		//Write and test a method that takes a Map<String, String> and a string and resturns the value for a key in the map that matches the
		//string parameter (i.e like a language dictionary lookup)
		
		//write and test a method that takes a List<String> and returns a Map<Character, Integer> containing a count of all the strings that start
		//with a given character
		
		

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
	
	public static List<String> search(List<String> list, String query) {
		List<String> results = new ArrayList<String>();
		for (String string :list) {
			if (string.contains(query)) {
				results.add(string);
			}
		}
		return results;
	}
	
	public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		
		for (Integer number : list) {
			if (number % 2 == 0) {
				results.get(0).add(number);	
			}
			if (number % 3 == 0) {
			results.get(1).add(number);
			}
			if (number % 5 == 0) {
				results.get(2).add(number);
			}
			if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0 ) {
				results.get(3).add(number);
			}
		}
		
		return results;
		
	 }
	
	public static List<Integer> calculateStringLengths(List<String> list){
		List<Integer> lengths = new ArrayList<Integer>();
		for (String string : list) {
			lengths.add(string.length());
		}
		return lengths;
	}
	
	public static Set<String> findAllThatStartWith(Set<String> set, char c) {
		Set<String> results = new HashSet<String>();
		
		for (String string : set) {
			if (string.charAt(0)== c) {
				results.add(string);
			}
		}
		return results;
	}
	
	public static List<String> convertSetToList(Set<String> set){
		List<String> results = new ArrayList<String>();
		for (String string : set) {
			results.add(string);
		}
		return results;
	}

}
