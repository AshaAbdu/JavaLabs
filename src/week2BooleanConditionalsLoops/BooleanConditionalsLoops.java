package week2BooleanConditionalsLoops;

public class BooleanConditionalsLoops {

	public static void main(String[] args) {
		//Create a variable named age and assign it a value of 14
		int age = 14;
		
		// print the boolean expression age >= 16 to the console and note the results.- out puts false when 14 
		// change the value of age to 18 and run again. //outputs true
		
		System.out.println(age >= 16);
		age = 18;
		System.out.println(age >= 18);
		
		//using a conditional, print "You can drive" if age is greater than or equal to 16
		//and "You can not drive" otherwise
		//change the value of age and rerun to see the result
		//if (condition){sysout} else {sysout}
		
		boolean hasLicense = true ;
		if (age >=16 && hasLicense) {
		System.out.println("You can drive");
		} else {
			System.out.println("You can not drive");
		}
		
		//add a new variable called hasLicense before the conditional
		//change the boolean expression in the conditional to  additionally include the need for hasLicense to be true
		//try changing the values of age and hasLicense and note the different results
		// boolean hasLicense =true;
		
		//create two new variables - costOfMilk and thirstLevel
		//create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50
		//or if thirstLevel is greater than 6 and prints"No Thanks" otherwise
		double costOfMilk = 2.50;
		int thirstLevel = 6;
		//when both false outputs no thanks, if one is true prints milk please
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		} else {
			System.out.println("No Thanks");
		}
		
		
		//create two variables called numberOfCookies and numberOfChildren
		//you will evenly distributed all of the cookies to the children and as the adult
		//you get to keep the remaining cookies to yourself
		//use a conditional to print the following based on the following conditions:
		//if there are 0 cookies remaining, print "Sad Face"
		//if there are less than 2 cookies, print "Yes!"
		//if there are less than 5 cookies, print "Whoohooo!"
		//if there are 5 or more cookies, print "Jackpot!"
		//division and use remainders = use module
		
		int numberOfCookies = 7;
		int numberOfChildren = 2;
		
		/*or save value in another variable eg int remainingCookies = numberOfCookies % numberOfChildren 
		and replace numberOfCookies % numberOfChildren with remainingCookies */
		
		if (numberOfCookies % numberOfChildren >= 5) {
			System.out.println("Jackpot!");
		} else if (numberOfCookies % numberOfChildren >=2) {
			System.out.println("Whooohooo!");
		} else if (numberOfCookies % numberOfChildren >0) {
			System.out.println("Yes!");
		} else {
			System.out.println("Sad Face");
		}
		

		
	}

}
